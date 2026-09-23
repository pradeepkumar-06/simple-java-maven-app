package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        int x = "BROKEN BUILD";
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
