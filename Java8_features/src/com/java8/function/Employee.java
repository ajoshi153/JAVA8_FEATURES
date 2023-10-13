package com.java8.function;

import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeSalary {

  public static void populate(ArrayList<Employee> arrayList) {
    arrayList.add(new Employee("Atharva", 26000));
    arrayList.add(new Employee("Adesh", 50000));
    arrayList.add(new Employee("Onkar", 60000));

  }

  public static void main(String[] args) {

    ArrayList<Employee> arrayList = new ArrayList<Employee>();
    populate(arrayList);

    Function<ArrayList<Employee>, Double> function = s -> {
      double total = 0;
      for (Employee e : arrayList) {
        total = total + e.getSalary();
      }
      return total;
    };

    System.out.println("Total salary of Employees: " + function.apply(arrayList));
  }
}