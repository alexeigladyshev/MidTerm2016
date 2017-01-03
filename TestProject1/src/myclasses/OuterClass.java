package myclasses;

/**
 * Created by aleks_000 on 12/11/2016.
 */
public class OuterClass {

    public int num1 = 10;
    InnerA A = new InnerA();
    InnerB B = new InnerB();

    public void outerMethodA(){
        System.out.println("This is outer method A");
        A.innerMethodA();
        B.innerMethodB();
        System.out.println(A.num1);
        System.out.println(B.num1);
    }

    private class InnerA{

        private int num1 = 20;
        private void innerMethodA(){
            System.out.println("This is inner method A for inner class A");
        }
    }
    private class InnerB{

        private int num1 = 30;
        private void innerMethodB(){
            System.out.println("This is inner method B for inner class B");
        }
    }
}












