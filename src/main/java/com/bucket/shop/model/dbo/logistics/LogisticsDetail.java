package com.bucket.shop.model.dbo.logistics;

import java.io.Serializable;

public class LogisticsDetail implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 6507002208311985333L;

    private String            time;

    private String            location;

    private String            context;

    private String            ftime;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getFtime() {
        return ftime;
    }

    public void setFtime(String ftime) {
        this.ftime = ftime;
    }
}
