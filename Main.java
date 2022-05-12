package jd.javaapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        String str3 = str1.concat(str2);

        System.out.println("String after concatenation is: "+ str3);
        sc.close();
    }
}
