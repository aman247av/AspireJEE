package com.jee00.aspirejee.Model;

public class Papers {
    private String date;
    private String shift;
    private String testlink;
    private String practicelink;
    private String total_M;
    private String total_Q;


    public  Papers(){

    }

    public Papers(String date, String shift, String testlink, String practicelink,String total_M,String total_Q) {
        this.date = date;
        this.shift = shift;
        this.testlink = testlink;
        this.practicelink = practicelink;
        this.total_M=total_M;
        this.total_Q=total_Q;
    }

    public String getTotal_M() {
        return total_M;
    }

    public void setTotal_M(String total_M) {
        this.total_M = total_M;
    }

    public String getTotal_Q() {
        return total_Q;
    }

    public void setTotal_Q(String total_Q) {
        this.total_Q = total_Q;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getTestlink() {
        return testlink;
    }

    public void setTestlink(String testlink) {
        this.testlink = testlink;
    }

    public String getPracticelink() {
        return practicelink;
    }

    public void setPracticelink(String practicelink) {
        this.practicelink = practicelink;
    }
}
