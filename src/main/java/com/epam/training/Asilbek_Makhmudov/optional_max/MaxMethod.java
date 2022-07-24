package com.epam.training.Asilbek_Makhmudov.optional_max;

import java.util.OptionalInt;


public class MaxMethod {
    public static OptionalInt max(int[] values) {
        if (values == null || values.length == 0) return OptionalInt.empty();
        OptionalInt result = OptionalInt.of(values[0]);
        for (int value : values) {
            if (value > result.getAsInt()) result = OptionalInt.of(value);
        } return result;
    }
}
