package com.Bridgelabz;

import java.util.Scanner;

public class UserRegistrationFormatValidationMain {


        public static void welcome() {
            System.out.println("Welcome to User Registration System Problem");
        }

        public static void main(String[] args) {
            welcome();
            UserRegistrationFormatValidation user = new UserRegistrationFormatValidation();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1 : to validate First Name ");
            System.out.println("Enter 2 : to validate Last Name ");
            switch (scanner.nextInt()) {
                case 1:
                    UserRegistrationFormatValidation.validFirstName();
                    break;
                case 2:
                    UserRegistrationFormatValidation.validLastName();
                    break;
                default:
                    System.out.println("Select a valid number");
            }
        }
    }


