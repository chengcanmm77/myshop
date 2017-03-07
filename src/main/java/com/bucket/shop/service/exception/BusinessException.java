package com.bucket.shop.service.exception;

/**
 * 业务异常
 * @author bucket
 */
public class BusinessException extends RuntimeException {

    /**  */
    private static final long serialVersionUID = -4029330562059983628L;

    private String            code;

    private String            msg;

    private Throwable         throwable;

    public BusinessException() {

    }

    public BusinessException(Throwable throwable) {
        super(throwable);
        this.throwable = throwable;
    }

    public BusinessException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public BusinessException(String code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public BusinessException(String code, String msg, Throwable throwable) {
        super(msg, throwable);
        this.code = code;
        this.msg = msg;
        this.throwable = throwable;
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

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

}
