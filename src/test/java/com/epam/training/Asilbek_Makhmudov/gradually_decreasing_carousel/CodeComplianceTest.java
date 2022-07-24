package com.epam.training.Asilbek_Makhmudov.gradually_decreasing_carousel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeComplianceTest {

    @Test
    void testInheritance() {
        assertEquals(DecrementingCarousel.class, GraduallyDecreasingCarousel.class.getSuperclass());
    }
}
