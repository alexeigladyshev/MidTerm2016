package myclasses;

/**
 * Created by aleks_000 on 12/14/2016.
 */
public class Constructors {

    int isOn = 1;
    private double num1;
    private double num2 = 12.0;
    public double num3 = 13.0;
    String test;


    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }



    //overloading constructors
    //constructor 1
    public void setNum1(double num1){
        this.num1 = num1;
    }
    public double getNum1(){
        return num1;
    }

    public Constructors(int isOn, String test){

        this.isOn = isOn;
        this.test = test;
    }
    //constructor 2
    public Constructors(String test){

        this.test = "Test 1 "+test;
        isOn += 12;
    }
    //constructor 3
    public Constructors(int isOn) {

        this.isOn = isOn + 7;
        test = "This is a test";
    }

    public void printToScreen(){

        System.out.println("This is a test message. IsOn value is "+ isOn);
    }
    public void printTest(){

        System.out.println(test);
    }
}
