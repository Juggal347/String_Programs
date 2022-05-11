package jd.javaapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Enter index:");
        int index = sc.nextInt();

        System.out.println("Unicode codepoint at index "+index+" is: "+str.codePointAt(index));
        sc.close();
    }
}
