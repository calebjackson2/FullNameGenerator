package com.pluralsight;

import javax.naming.Name;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First name: ");
        String first = input.nextLine().trim();
        System.out.print("Middle name: ");
        String middle = input.nextLine().trim();
        System.out.print("Last name: ");
        String last = input.nextLine().trim();
        System.out.print("Suffix: ");
        String suffix = input.nextLine().trim();
        String fullName = first
                + (middle.isEmpty() ? "" : " " + middle)
                + " " + last
                + (suffix.isEmpty() ? "" : ", " + suffix);

        System.out.println("Full name: " + fullName);




    }
}
