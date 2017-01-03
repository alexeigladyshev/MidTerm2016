package myclasses;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by aleks_000 on 12/10/2016.
 */
public class UseQueue {

    public static void main(String[] args){

        Queue<String> list = new LinkedList<>();
        list.add("Michael");
        list.add("Lohan");
        list.add("Katie");
        list.add("Michelle");
        list.add("Stephen");

        for (String customer : list){
            System.out.println(customer);
        }
    }
}
