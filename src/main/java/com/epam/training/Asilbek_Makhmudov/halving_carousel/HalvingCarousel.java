package com.epam.training.Asilbek_Makhmudov.halving_carousel;

public class HalvingCarousel extends DecrementingCarousel {
    public HalvingCarousel(final int capacity) {
        super(capacity);
    }
    @Override
    public CarouselRun run() {
        executed = true;
        if(running) return null;
        running = true;
        return new CarouselRun() {
            @Override
            public int next() {
                int count = 0;
                while (count < carousel.length && carousel[position %= carousel.length] <= 0) {
                    position++;
                    count++;
                }
                if (count == carousel.length) return -1;
                int temp = carousel[position];
                carousel[position] = carousel[position]/2;
                position++;
                return temp;
            }
            @Override
            public boolean isFinished() {
                for (int var : carousel){
                    if (var > 0) return false;
                }
                return true;
            }
        };
    }
}

