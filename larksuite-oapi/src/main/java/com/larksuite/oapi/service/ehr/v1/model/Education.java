// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.ehr.v1.model;
import com.google.gson.annotations.SerializedName;

public class Education {
    @SerializedName("level")
    private Integer level;
    @SerializedName("school")
    private String school;
    @SerializedName("major")
    private String major;
    @SerializedName("degree")
    private Integer degree;
    @SerializedName("start")
    private String start;
    @SerializedName("end")
    private String end;

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getDegree() {
        return this.degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public String getStart() {
        return this.start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return this.end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

}