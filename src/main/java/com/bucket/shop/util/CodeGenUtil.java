package com.bucket.shop.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * 代码生成工具
 * @author user
 *
 */
public class CodeGenUtil {

    private static String       genFile            = "d:\\data\\gen\\";

    private static String       simpleName         = null;

    private static String       clName             = null;

    private static final String mapperBasePackName = "com.bucket.shop.dal.mapper";

    private static String       modelName          = "";

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("请输入do。。。");
        Scanner scan = new Scanner(System.in);
        String classStr = scan.nextLine();

        Class clazz = Class.forName(classStr);

        genFile += clazz.getSimpleName();
        simpleName = clazz.getSimpleName();

        modelName = simpleName;
        if (simpleName.endsWith("Do")) {
            modelName = simpleName.substring(0, simpleName.length() - 2);
        }

        //生成sql
        genSql(clazz);
        //生成xml
        genXml(clazz);
        //生成mapper
        //生成dao
        //生成service
        //生成croo
        //生成vo
        //生成so

        System.out.println("====完成===");

    }

    public static void genSql(Class clazz) {
        StringBuilder sb = new StringBuilder();
        String tableName = convertToDBName(modelName.toLowerCase());
        sb.append("create table " + tableName + "(");
        sb.append("\n");
        sb.append("\tid bigInt(20) primary key auto_increment");

        Field[] fields = getFieldByClass(clazz);
        for (Field field : fields) {
            if (field.getName().equals("id")) {
                continue;
            }
            sb.append(",\n");
            sb.append("\t" + convertToDBName(field.getName()));
            sb.append(" " + convertToDBTypeName(field.getType().getSimpleName()));

        }
        sb.append("\n)\n");
        sb.append("ENGINE=InnoDB\n");
        sb.append("DEFAULT CHARSET=utf8\n");
        sb.append("COLLATE='utf8_general_ci'\n");
        sb.append(";\n");
        sb.append("alter table " + tableName + " auto_increment = 6000;\n");

        File file = genFile(genFile + File.separator + modelName + "Createtable.sql");

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            fos.write(sb.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(file.getAbsolutePath());
    }

    public static void genXml(Class clazz) {
        String tableName = convertToDBName(modelName.toLowerCase());

        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
        sb.append("<!DOCTYPE mapper PUBLIC\n");
        sb.append("   \"-//mybatis.org//DTD Mapper 3.0//EN\"\n");
        sb.append("    \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">\n");
        String modeName = simpleName;
        if (simpleName.endsWith("Do")) {
            modeName = simpleName.substring(0, simpleName.length() - 2);
        }

        sb.append("<mapper namespace=\"" + mapperBasePackName + "." + modeName.toLowerCase() + "."
                  + modeName + "Mapper\">\n");
        sb.append("<resultMap id=\"" + modeName + "Map\" type=\"" + simpleName + "\">\n");

        Field[] fields = getFieldByClass(clazz);

        for (Field field : fields) {
            String fieldName = field.getName();
            String dbName = convertToDBName(fieldName);
            String dbType = convertToDBType(field.getType().getSimpleName());
            sb.append("\t<result column=\"" + dbName + "\" property=\"" + fieldName
                      + "\" jdbcType=\"" + dbType + "\" />");
            sb.append("\n");
        }
        sb.append("</resultMap>\n");
        sb.append("\n\n");

        //voResultMap
        sb.append("<resultMap id=\"" + modeName + "VoMap\" type=\"" + simpleName + "Vo\">\n");
        for (Field field : fields) {
            String fieldName = field.getName();
            String dbName = convertToDBName(fieldName);
            String dbType = convertToDBType(field.getType().getSimpleName());
            sb.append("\t<result column=\"" + dbName + "\" property=\"" + fieldName
                      + "\" jdbcType=\"" + dbType + "\" />");
            sb.append("\n");
        }
        sb.append("</resultMap>\n");
        sb.append("\n\n");

        //
        sb.append("<sql id=\"all_column\">");
        sb.append("\n");
        sb.append("\t");
        sb.append(convertToDBName(fields[0].getName()));
        for (int i = 1; i < fields.length; i++) {
            sb.append(",");
            String fieldName = fields[i].getName();
            String dbName = convertToDBName(fieldName);
            sb.append(dbName);
        }
        sb.append("\n</sql>");
        sb.append("\n\n");

        //insert
        sb.append(
            "<insert id=\"insert\" useGeneratedKeys=\"true\" keyProperty=\"id\" parameterType=\""
                  + simpleName + "\">\n");
        sb.append("\tinsert into " + convertToDBName(modeName).toLowerCase() + "(");
        sb.append(convertToDBName(fields[0].getName()));
        for (int i = 1; i < fields.length; i++) {
            sb.append(",");
            sb.append(convertToDBName(fields[i].getName()));
            if (i % 8 == 0) {
                sb.append("\n\t");
            }

        }
        sb.append("\n\t) values(");
        sb.append("#{" + fields[0].getName() + "}");
        for (int i = 1; i < fields.length; i++) {
            sb.append(",");

            if (fields[i].getName().equals("createTime")
                || fields[i].getName().equals("updateTime")) {
                sb.append("now()");
            } else {
                sb.append("#{" + fields[i].getName() + "}");
            }
            if (i % 8 == 0) {
                sb.append("\n\t");
            }

        }
        sb.append("\n\t)");
        sb.append("\n</insert>");
        sb.append("\n\n");

        //gen select
        sb.append("<select id=\"selectById\" resultMap=\"" + modeName + "Map\">");
        sb.append("\n");
        sb.append("\tselect <include refid=\"all_column\"/> from " + tableName + " where id=#{id}");
        sb.append("\n</select>\n\n");

        //gen select vo 
        sb.append("<select id=\"selectVoById\" resultMap=\"" + modeName + "VoMap\">");
        sb.append("\n");
        sb.append("\tselect <include refid=\"all_column\"/> from " + tableName + " where id=#{id}");
        sb.append("\n</select>\n\n");

        //query list
        sb.append("<select id=\"queryList\" resultMap=\"" + modeName + "Map\">\n");
        sb.append("\tselect <include refid=\"all_column\"/> from " + tableName
                  + " where 1=1 and <include refid=\"whereSql\"/> />");
        sb.append("\n</select>\n\n");

        //query list vo
        sb.append("<select id=\"queryVoList\" resultMap=\"" + modeName + "VoMap\">\n");
        sb.append("\tselect <include refid=\"all_column\"/> from " + tableName
                  + " where 1=1 and <include refid=\"whereSql\"/> />");
        sb.append("\n</select>\n\n");

        //gen wheresql
        sb.append("<sql id=\"whereSql\" >\n");
        for (Field field : fields) {
            String fieldName = field.getName();
            String dbName = convertToDBName(fieldName);
            sb.append("\t<if test=\"" + fieldName + " != null and " + fieldName + " !=''\">\n");
            sb.append("\t" + dbName + "=#{" + dbName + "}\n");
            sb.append("\t</if>\n");
        }
        sb.append("</sql>\n");

        //gen udpate
        sb.append("<update id=\"updateForDeleteById\" resultType=\"long\">\n");
        for (Field field : fields) {
            String fieldName = field.getName();
            String dbName = convertToDBName(fieldName);
            sb.append("\t<if test=\"" + fieldName + " != null and " + fieldName + " !=''\">\n");
            sb.append("\t" + dbName + "=#{" + dbName + "}\n");
            sb.append("\t</if>\n");
        }
        sb.append("</update>\n");

        //gen delete
        sb.append("<update id=\"updateForDeleteById\">\n");
        sb.append("update " + tableName + " set status=0 where id=#{id} \n");
        sb.append("</update>\n\n");

        //gen delete
        sb.append("<delete id=\"updateForDeleteById\">\n");
        sb.append("\tdelete from " + tableName + " where id=#{id} \n");
        sb.append("</delete>\n");

        sb.append("\n");
        sb.append("</mapper>");

        File file = genFile(genFile + File.separator + modeName + "Mapper.xml");

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            fos.write(sb.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(file.getAbsolutePath());

    }

    private static File genFile(String fileName) {
        File file = new File(fileName);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return file;
    }

    private static Field[] getFieldByClass(Class clazz) {
        Field[] fields = clazz.getDeclaredFields();
        Class sup = clazz.getSuperclass();
        if (sup != null) {
            Field[] supFields = sup.getDeclaredFields();
            Field[] merge = new Field[fields.length + supFields.length];
            System.arraycopy(fields, 0, merge, 0, fields.length);
            System.arraycopy(supFields, 0, merge, fields.length, supFields.length);

            fields = merge;
        }

        return fields;
    }

    private static String convertToDBName(String name) {
        StringBuilder sb = new StringBuilder();
        sb.append(name.charAt(0));
        for (int i = 1; i < name.length(); i++) {
            int cha = name.charAt(i);
            if (cha >= 65 && cha <= 90) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase((char) cha));
        }

        return sb.toString();
    }

    public static String convertToDBType(String type) {
        if (type.equalsIgnoreCase("int") || type.equalsIgnoreCase("Integer")) {
            return "INTEGER";
        } else if (type.equalsIgnoreCase("Long")) {
            return "BIGINT";
        } else if (type.equalsIgnoreCase("float")) {
            return "DECIMA)";
        } else if (type.equalsIgnoreCase("Double")) {
            return "DECIMA)";
        } else if (type.equalsIgnoreCase("Boolean")) {
            return "TINYINT";
        } else if (type.equalsIgnoreCase("String")) {
            return "VARCHAR";
        } else if (type.equalsIgnoreCase("Date")) {
            return "TIMESTAMP";
        } else if (type.equals("char")) {
            return "char";
        }

        return "VARCHAR";
    }

    public static String convertToDBTypeName(String type) {
        if (type.equalsIgnoreCase("int") || type.equalsIgnoreCase("Integer")) {
            return "bigint(11)";
        } else if (type.equalsIgnoreCase("Long")) {
            return "bigint(20)";
        } else if (type.equalsIgnoreCase("float")) {
            return "decima(20,4)";
        } else if (type.equalsIgnoreCase("Double")) {
            return "decima(20,4))";
        } else if (type.equalsIgnoreCase("Boolean")) {
            return "tinyint(2)";
        } else if (type.equalsIgnoreCase("String")) {
            return "varchar(255)";
        } else if (type.equalsIgnoreCase("Date")) {
            return "timestamp";
        } else if (type.equals("char")) {
            return "char(2)";
        }

        return "varchar(255)";
    }

}
