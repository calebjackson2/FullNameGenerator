package com.pluralsight;

import javax.naming.Name;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("First name: ");
        String firstName = Scanner.nextLine().trim();
        System.out.print("Middle name: ");
        String middleName = Scanner.nextLine().trim();
        System.out.print("Last name: ");
        String lastName = Scanner.nextLine().trim();
        System.out.print("Suffix: ");
        String suffix = Scanner.nextLine().trim();
        String fullName = firstName
                + (middleName.isEmpty() ? "" : " " + middleName)
                + " " + lastName
                + (suffix.isEmpty() ? "" : ", " + suffix);

        System.out.println("Full name: " + fullName);




    }
}
