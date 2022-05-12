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

        int result = str1.compareToIgnoreCase(str2);

        if (result<0)
            System.out.println(str1+" is less than "+str2);

        else if (result == 0)
            System.out.println(str1+" is equal to "+str2);

        else
            System.out.println(str1+" is greater than "+str2);

        sc.close();
    }
}
