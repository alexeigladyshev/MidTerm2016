package myclasses;

import java.util.LinkedList;

/**
 * Created by aleks_000 on 12/10/2016.
 */
public class ArrayLists {

    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<String>();
        list.add("NY");
        list.add("VA");
        list.add("AZ");
        list.add("NM");

        for (String state : list){
            System.out.println(state);
        }
    }
}
