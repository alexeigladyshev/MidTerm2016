package myclasses;

import java.util.Random;

/**
 * Created by aleks_000 on 12/10/2016.
 */
public class Quiz5 {

    public static void main(String[] args) {

        Random rn = new Random(); //create new Random Object
        int[] array = new int[10]; //create new array of size 10

        for (int i=0; i< array.length; i++) { //for loop, to assign initial values

            array[i]=rn.nextInt(100000);  //look up nextInt() method of Random class to see how it works
            if (array[i]%2==0)                 //if the random number is even (remainder is 0 when dividing by 2)
                array[i]+=1;                   //make it odd by adding 1 to it
        }
        for(int index : array)                 //this is a for loop we did in class to print the array on screen
            System.out.println(index);         //it is more compact than what I am used to, and I am still gettting used
    }                                          //to this notation, which is new to me
}
