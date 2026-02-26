package com.example.jenkins;

public class HelloJenkins {

    public static void main(String[] args) {
        System.out.println(getMessage());
    }

    public static String getMessage() {
        return "Hello Jenkins! Your Maven project is running successfully.";
    }
}
