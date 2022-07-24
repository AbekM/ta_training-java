package com.epam.training.Asilbek_Makhmudov.decrementing_carousel_with_limit;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    public int limit;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int limit) {
        super(capacity);
        this.limit = limit;

    }


    @Override
    public CarouselRun run() {
        executed = true;
        if(running) return null;
        running = true;

        return new CarouselRun() {
            int iterations;
            @Override
            public int next() {
                int count = 0;
                while (count < carousel.length && carousel[position %= carousel.length] <= 0) {
                    position++;
                    count++;
                }
                if (isFinished()) return -1;
                else {
                    iterations++;
                    return carousel[position++]--;
                }
            }
            @Override
            public boolean isFinished() {
                if (iterations >= limit)  return true;
                for (int var : carousel){
                    if (var > 0) return false;
                }
                return true;
            }
        };
    }
}
