package com.saestwo.employees;

public class Student {
    private String name,firstlastname,secondlastname,curp;
    int semester;

    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstlastname() {
        return firstlastname;
    }

    public void setFirstlastname(String firstlastname) {
        this.firstlastname = firstlastname;
    }

    public String getSecondlastname() {
        return secondlastname;
    }

    public void setSecondlastname(String secondlastname) {
        this.secondlastname = secondlastname;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
