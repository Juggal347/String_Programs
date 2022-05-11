package jd.javaapp;

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            // write your code here
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your string:");
            String str = sc.nextLine();

            System.out.println("Enter the index:");
            int index = sc.nextInt();

            System.out.println(str.charAt(index));

            sc.close();
        }
    }

