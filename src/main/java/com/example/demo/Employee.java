package com.example.demo;

public class Employee {
    private long enpid;
    private String fstname;
    private String lstname;
    private String SSN;
    private String bmonth;
    private int bday;
    private int byear;

    public long getEnpid() {
        return enpid;
    }

    public void setEnpid(long enpid) {
        this.enpid = enpid;
    }

    public String getFstname() {
        return fstname;
    }

    public void setFstname(String fstname) {
        this.fstname = fstname;
    }

    public String getLstname() {
        return lstname;
    }

    public void setLstname(String lstname) {
        this.lstname = lstname;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getBmonth() {
        return bmonth;
    }

    public void setBmonth(String bmonth) {
        this.bmonth = bmonth;
    }

    public int getBday() {
        return bday;
    }

    public void setBday(int bday) {
        this.bday = bday;
    }

    public int getByear() {
        return byear;
    }

    public void setByear(int byear) {
        this.byear = byear;
    }
}
