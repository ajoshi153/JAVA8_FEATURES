package com.java8.consumer;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentsMain {

  public static void populate(ArrayList<Students> arrayList) {
    arrayList.add(new Students("Atharva", 70));
    arrayList.add(new Students("Yadneya", 50));
    arrayList.add(new Students("Achyut", 40));
    arrayList.add(new Students("Aditya", 20));

  }

  public static void main(String[] args) {
    ArrayList<Students> arrayList = new ArrayList<Students>();
    populate(arrayList);

    Predicate<Students> predicate = a -> a.getMarks() >= 60;
    Function<Students, String> function = a -> {
      if (a.getMarks() > 60) {
        return "A";
      } else if (a.getMarks() > 45) {
        return "B";
      } else if (a.getMarks() > 35) {
        return "C";
      } else {
        return "D";
      }
    };

    Consumer<Students> consumer = a -> {
      System.out.println("Name: " + a.getName());
      System.out.println("Marks: " + a.getMarks());
      System.out.println("Grade: " + function.apply(a));
      System.out.println("______________*_");
    };

    for (Students s : arrayList) {
//      if (predicate.test(s)) {
//        consumer.accept(s);
//      }
      consumer.accept(s);
    }
  }
}