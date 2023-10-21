package com.cybage.function;

import java.util.Scanner;
import java.util.function.Function;

public class Authentication {

  public static void main(String[] args) {
    Function<String, String> function = u -> u.toLowerCase();
    Function<String, String> function2 = n -> n.substring(0, 5);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = scanner.nextLine();
    System.out.println("Enter Password");
    String userPwd = scanner.nextLine();

    if (function.andThen(function2).apply(userName).equals("athar") && userPwd.equals("abc")) {
      System.out.println("Succesfull");
    } else {
      System.out.println("Unrecognised");
    }

  }
}
