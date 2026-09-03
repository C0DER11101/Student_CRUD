package com.student.model;

import java.math.BigInteger;
import java.util.Date;

public class StudentModel {
    private String altKey;
    private String fullName;
    private BigInteger admitNo;
    private Date dob;
    private Date admitDate;
    private Double percentiles;
    private String eligible;

    public String getAltKey() {
        return altKey;
    }

    public void setAltKey(String altKey) {
        this.altKey = altKey;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public BigInteger getAdmitNo() {
        return admitNo;
    }

    public void setAdmitNo(BigInteger admitNo) {
        this.admitNo = admitNo;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(Date admitDate) {
        this.admitDate = admitDate;
    }

    public Double getPercentiles() {
        return percentiles;
    }

    public void setPercentiles(Double percentiles) {
        this.percentiles = percentiles;
    }

    public String getEligible() {
        return eligible;
    }

    public void setEligible(String eligible) {
        this.eligible = eligible;
    }

    @Override
    public String toString() {
        return "StudenModel{" +
                "altKey=" + altKey +
                ", fullName='" + fullName + '\'' +
                ", admitNo='" + admitNo + '\'' +
                ", dob=" + dob +
                ", admitDate=" + admitDate +
                ", percentiles=" + percentiles +
                ", eligible='" + eligible + '\'' +
                '}';
    }
}