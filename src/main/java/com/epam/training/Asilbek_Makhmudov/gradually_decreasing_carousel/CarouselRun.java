package com.epam.training.Asilbek_Makhmudov.gradually_decreasing_carousel;

public class CarouselRun {
    public int position = 0;
    public int next() {
        int count = 0;
        while (count < DecrementingCarousel.carousel.length && DecrementingCarousel.carousel[position %= DecrementingCarousel.carousel.length] <= 0) {
            position++;
            count++;
        }
        if (count == DecrementingCarousel.carousel.length) return -1;
        return DecrementingCarousel.carousel[position++]--;
    }
    public boolean isFinished() {
        for (int var : DecrementingCarousel.carousel){
            if (var > 0) return false;
        }
        return true;
    }
}
