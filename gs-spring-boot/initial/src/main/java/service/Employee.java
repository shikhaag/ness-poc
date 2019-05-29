package com.springrestapi.service;

public class Employee {

  private int id;
  private String fname;
  private String lname;
  private String addess;

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", fname='" + fname + '\'' +
        ", lname='" + lname + '\'' +
        ", addess='" + addess + '\'' +
        '}';
  }
  public Employee(int id, String fname, String lname, String addess){
    this.id = id;
    this.fname = fname;
    this.lname = lname;
    this.addess = addess;
  }
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFname() {
    return fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }

  public String getAddess() {
    return addess;
  }

  public void setAddess(String addess) {
    this.addess = addess;
  }
}
