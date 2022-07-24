package com.epam.training.Asilbek_Makhmudov.cycle_swap;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int [] array) {
        if (array != null && array.length != 0){
            int t = array[array.length - 1];
            for (int i = 1; i < array.length; i++){
                array[array.length-i] = array[array.length-i-1];
            }
            array[0] = t;
        }
    }
    static void cycleSwap(int [] array, int shift) {
        if (array != null && array.length != shift && array.length != 0){
            int[] newArray = Arrays.copyOf(array, shift);
            for (int i = 0; i < shift; i++) {
                newArray[shift - i - 1] = array[array.length - i - 1];
            }
            for (int i = 1; i <= array.length - shift; i++) {
                array[array.length - i] = array[array.length - i - shift];
            }
            System.arraycopy(newArray, 0, array, 0, shift);
        }
    }
}
