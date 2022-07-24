package com.epam.training.Asilbek_Makhmudov.max;

public class MaxMethod {
    public static int max(int[] values) {
        int maximumIntInArray = values[0];
        for (int value : values)
            if (maximumIntInArray < value) {
                maximumIntInArray = value;
            }
    return maximumIntInArray;
    }
}
