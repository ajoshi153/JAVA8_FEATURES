package com.java8.dateTime;

import java.time.LocalDateTime;
import java.time.Month;

public class PerticularDateTime {

  public static void main(String[] args) {

    LocalDateTime dateTime = LocalDateTime.of(1997, Month.MARCH, 15, 12, 01, 20, 500);
    System.out.println(dateTime);
    System.out.println("After 6 months: " + dateTime.plusMonths(6));
    System.out.println("Before 6 months: " + dateTime.minusMonths(6));

  }
}