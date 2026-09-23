package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        THIS_IS_A_COMPILATION_ERROR_FOR_TESTING  // intentional error
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
