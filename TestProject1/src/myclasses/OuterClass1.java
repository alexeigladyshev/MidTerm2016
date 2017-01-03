package myclasses;

/**
 * Created by aleks_000 on 12/14/2016.
 */
public class OuterClass1 {

    public int num1;
    public double d1;
    public String str1 = new String("This is a test string");

    InnerClass1 ic = new InnerClass1(55);
    InnerClass2 ic2 = new InnerClass2();

    //constructor
    public OuterClass1(int num2, double d2){

        num1 = num2;
        d1 = d2;
    }

    //method belongs to our outer class
    public void printToScreenOuter(){

        System.out.println("This is our outer method");
    }
    public void useInnerClass(){

        ic.printToScreenInner();
        ic2.useInnerClass2();
    }

    private class InnerClass1{

        int num1 = 20;

        //constructor
        public InnerClass1(int num1){

            this.num1 = num1;
        }

        //method belongs to inner class
        private void printToScreenInner(){

            System.out.println("This is our inner method");
        }
    }

    private class InnerClass2{

        //method belongs to inner class
        private void useInnerClass2(){

            System.out.println("This is example of inner class 2");
        }
    }
}
