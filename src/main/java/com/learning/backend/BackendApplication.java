package com.learning.backend;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        String s = "A man, a plan, a canal: Panama";
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!isAlphaNumeric(leftChar)) {
                left++;
                continue;
            }

            if (!isAlphaNumeric(rightChar)) {
                right--;
                continue;
            }

            if (leftChar >= 'A' && leftChar <= 'Z') {
                leftChar += 32;
            }
            if (right >= 'A' && rightChar <= 'Z') {
                rightChar += 32;
            }

            if(leftChar != rightChar){

            }
        }


//		SpringApplication.run(BackendApplication.class, args);
    }

    static boolean isAlphaNumeric(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }


}
