package jd.javaapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Enter range:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Unicode codepoint count in range "+x+" to "+y+" is: "+str.codePointCount(x,y));
        sc.close();
    }
}
