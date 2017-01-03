package myclasses;

import java.util.Scanner;

/**
 * Created by aleks_000 on 12/10/2016.
 */
public class TestClass1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("This is a test program");
        System.out.println("Please enter your name");

        String name1 = sc.nextLine();
        System.out.println("Hello, "+name1+"!");
    }
}
