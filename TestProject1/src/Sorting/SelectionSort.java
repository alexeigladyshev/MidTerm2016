package Sorting;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by aleks_000 on 12/11/2016.
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] array = new int[]{10, 9, 4, 7, 3, 14, 0, 2, 5, 11,
                                23, 56, 75 , 3, 6, 73, 29, 70, 5,
                                45, 689, 54, 8, 13, 12};

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {

                if (array[j]<array[i]){ //swap the two locations (can create a separate method if we want to)
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int value : array)
            System.out.println(value);
    }
}









