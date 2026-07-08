package org.asafta;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String getMessage() {
        return "Hello World!";
    }

    public static String getVersion() {
        return "1.0.0";
    }

    public static void main(String[] args) {
        System.out.println(getMessage());
        System.out.println(getVersion());
    }
}
