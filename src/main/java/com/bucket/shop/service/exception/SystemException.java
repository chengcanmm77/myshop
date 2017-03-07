package com.bucket.shop.service.exception;

import java.util.Map;

public class SystemException extends RuntimeException {

    /**  */
    private static final long   serialVersionUID = 1L;

    private String              code;

    private String              msg;

    private Map<Object, Object> extData;

    private Throwable           throwable;

    public SystemException(String code, String msg, Map<Object, Object> extData,
                           Throwable throwable) {
        super(msg, throwable);
        this.code = code;
        this.msg = msg;
        this.extData = extData;
        this.throwable = throwable;
    }

    public SystemException(String msg, String code) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public SystemException(Throwable throwable) {
        super(throwable);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<Object, Object> getExtData() {
        return extData;
    }

    public void setExtData(Map<Object, Object> extData) {
        this.extData = extData;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

}
