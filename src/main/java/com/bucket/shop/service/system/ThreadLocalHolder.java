package com.bucket.shop.service.system;

public class ThreadLocalHolder {

    public static ThreadLocal<String> tokenHold = new ThreadLocal<String>();

    public static String getToken() {
        return tokenHold.get();
    }

    public static void setToken(String token) {
        tokenHold.set(token);
    }

}
