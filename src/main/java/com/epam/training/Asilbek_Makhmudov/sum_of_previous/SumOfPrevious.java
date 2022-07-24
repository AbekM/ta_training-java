package com.epam.training.Asilbek_Makhmudov.sum_of_previous;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};
        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }
    public static boolean[] getSumCheckArray(int[] array){
        boolean[] booleanArray = new boolean[array.length];
        booleanArray[0] = false;
        booleanArray[1] = false;
        for (int i = 2; i < array.length; i ++){
            booleanArray[i] = array[i] == array[i - 1] + array[i - 2];
        }
        return booleanArray;
    }
}
