package com.epam.training.Asilbek_Makhmudov.local_maxima_remove;

import java.util.Arrays;

public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
        int[] newArray = new int[array.length];
        int arrayPadding = 0;
        for (int i = 0, k = 0; i < array.length; i++){
            if (i == 0){
                if (array[i] > array[i+1]){
                    arrayPadding++;
                }else {
                    newArray[k++] = array[i];
                }
            } else if (i == array.length - 1) {
                if (array[i] > array[i-1]){
                    arrayPadding++;
                }else {
                    newArray[k++] = array[i];
                }
            } else if ((array[i] > array[i+1]) && (array[i] > array[i-1])) {
                arrayPadding++;
            }else {
                newArray[k++] = array[i];
            }
        }
        return Arrays.copyOf(newArray, array.length - arrayPadding);
    }
}
