package myclasses;

/**
 * Created by aleks_000 on 12/14/2016.
 */
public class Class1Test {

    public static void main(String[] args) {

        int num1 = 30;
        double d1 = 23.0;

        OuterClass1 myClass = new OuterClass1(num1, d1);

        myClass.printToScreenOuter();
        myClass.useInnerClass();
    }
}
