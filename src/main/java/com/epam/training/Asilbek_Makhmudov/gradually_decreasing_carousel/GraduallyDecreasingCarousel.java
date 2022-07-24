package com.epam.training.Asilbek_Makhmudov.gradually_decreasing_carousel;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }
    int decrement=1;
    @Override
    public CarouselRun run() {
        executed = true;
        if(running) return null;
        running = true;
        return new CarouselRun() {
            @Override
            public int next() {
                //int count = 0;
                int temp;
                if (isFinished()) return -1;
                else {
                    temp = carousel[position];
                    carousel[position] -= decrement;
                    do {
                        position++;
                        if (position == carousel.length){
                            decrement++;
                            position = 0;
                        }
                    } while((carousel[position] <= 0) && !isFinished());
                }
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
