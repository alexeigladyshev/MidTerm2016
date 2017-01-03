package myclasses;

import java.util.Scanner;

/**
 * Created by aleks_000 on 12/14/2016.
 */
public class ConstructorsTest {

    public static void main(String[] args) {

        Constructors cs1 = new Constructors(65, "This is test1");
        Constructors cs2 = new Constructors(44, "Hello, how are you?");
        Constructors cs3 = new Constructors(0, "Midterm next week");
        Constructors cs4 = new Constructors("Testing constructors");
        Constructors cs5 = new Constructors(10);

        cs1.setNum1(11.0);
        System.out.println("Num1 equals "+cs1.getNum1() );

        cs1.num3 = 25.0;


                /*
        //cs1.printToScreen();
        //cs1.printTest();
        //cs2.printToScreen();
        //cs2.printTest();
        cs3.printToScreen();
        cs3.printTest();
        cs4.printToScreen();
        cs4.printTest();
        cs5.printToScreen();
        cs5.printTest();
        */
    }




}
