package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    private static final Pattern[] inputRegexes = new Pattern[4];
    static {
        inputRegexes[0] = Pattern.compile(".*[A-Z].*");
        inputRegexes[1] = Pattern.compile(".*[a-z].*");
        inputRegexes[2] = Pattern.compile(".*\\d.*");
        inputRegexes[3] = Pattern.compile(".*[`~!@#$%^&*()\\-_=+\\\\|\\[{\\]};:'\",<.>/?].*");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] passwords = new String[n];
        List<String> strongPasswords = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            passwords[i] = scanner.nextLine();
            if(checkPassword(passwords[i])){
                strongPasswords.add(passwords[i]);
            }
        }
        for (String s : strongPasswords) {
            System.out.println(s);
        }
    }

    private static boolean checkPassword(String password) {
        boolean isValid = true;
        if(password.length() >= 8){
            for (Pattern inputRegex : inputRegexes) {
                if (!inputRegex.matcher(password).matches()) {
                    isValid = false;
                    break;
                }
            }
        }
        else {
            isValid = false;
        }
        return isValid;
    }
}
