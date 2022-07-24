package com.epam.training.Asilbek_Makhmudov.decrementing_carousel;

import static com.epam.training.Asilbek_Makhmudov.decrementing_carousel.DecrementingCarousel.carousel;

public class CarouselRun {
    int position = 0;
    public int next() {
        int count = 0;
        while (count < carousel.length && carousel[position %= carousel.length] <= 0) {
            position++;
            count++;
        }
        if (count == carousel.length) return -1;
        return carousel[position++]--;
    }

    public boolean isFinished() {
        for (int var : carousel){
            if (var > 0) return false;
        }
        return true;
    }
}