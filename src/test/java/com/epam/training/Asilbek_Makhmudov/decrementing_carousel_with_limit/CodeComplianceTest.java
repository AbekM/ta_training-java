package com.epam.training.Asilbek_Makhmudov.decrementing_carousel_with_limit;

import com.epam.training.Asilbek_Makhmudov.decrementing_carousel_with_limit.DecrementingCarousel;
import com.epam.training.Asilbek_Makhmudov.decrementing_carousel_with_limit.DecrementingCarouselWithLimitedRun;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeComplianceTest {

    @Test
    void testInheritance() {
        assertEquals(DecrementingCarousel.class, DecrementingCarouselWithLimitedRun.class.getSuperclass());
    }
}
