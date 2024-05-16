/*
Write a program to check whether a String can be a valid email address or not
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q20_StringEmailValidator {
    public static void main(String[] args) {
        String email = "example@example.com"; // Change this to test different email addresses

        if (isValidEmail(email)) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is not a valid email address.");
        }
    }

    // Method to check if a string is a valid email address
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
