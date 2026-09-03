package com.student.dto;

import java.util.Date;

public class StudentDTO {
    private String firstName;
    private String lastName;
    private String admitNo;
    private Date dob;
    private Date admitDate;
    private Double secondaryPercentile;
    private Double srSecondaryPercentile;
    private Boolean isEligible;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdmitNo() {
        return admitNo;
    }

    public void setAdmitNo(String admitNo) {
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

    public Double getSecondaryPercentile() {
        return secondaryPercentile;
    }

    public void setSecondaryPercentile(Double secondaryPercentile) {
        this.secondaryPercentile = secondaryPercentile;
    }

    public Double getSrSecondaryPercentile() {
        return srSecondaryPercentile;
    }

    public void setSrSecondaryPercentile(Double srSecondaryPercentile) {
        this.srSecondaryPercentile = srSecondaryPercentile;
    }

    public Boolean getEligible() {
        return isEligible;
    }

    public void setEligible(Boolean eligible) {
        isEligible = eligible;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", admitNo='" + admitNo + '\'' +
                ", dob=" + dob +
                ", admitDate=" + admitDate +
                ", secondaryPercentile=" + secondaryPercentile +
                ", srSecondaryPercentile=" + srSecondaryPercentile +
                ", isEligible=" + isEligible +
                '}';
    }
}