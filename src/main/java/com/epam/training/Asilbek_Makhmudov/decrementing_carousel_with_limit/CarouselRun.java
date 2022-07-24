package com.epam.training.Asilbek_Makhmudov.decrementing_carousel_with_limit;

import static com.epam.training.Asilbek_Makhmudov.decrementing_carousel_with_limit.DecrementingCarousel.carousel;

public class CarouselRun {
    public int position = 0;
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
