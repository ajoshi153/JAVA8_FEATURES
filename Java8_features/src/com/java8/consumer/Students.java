package com.java8.consumer;

public class Students {

  private String name;
  private int marks;

  public Students() {
    // TODO Auto-generated constructor stub
  }

  public Students(String name, int marks) {
    super();
    this.name = name;
    this.marks = marks;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMarks() {
    return marks;
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }

  @Override
  public String toString() {
    return "Students [name=" + name + ", marks=" + marks + "]";
  }

}