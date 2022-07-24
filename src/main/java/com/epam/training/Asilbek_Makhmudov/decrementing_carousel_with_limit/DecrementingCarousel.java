package com.epam.training.Asilbek_Makhmudov.decrementing_carousel_with_limit;


public class DecrementingCarousel {
    static int[] carousel;
    static int capacity;
    public int counter = 0;

    boolean executed = false;
    boolean running = false;

    public DecrementingCarousel(int capacity) {
        DecrementingCarousel.capacity = capacity;
        carousel = new int[capacity];
    }

    public boolean addElement(int element){
        if (executed) return false;
        if (counter < carousel.length && element > 0){
            carousel[counter] = element;
            counter++;
            return true;
        }
        return false;
    }

    public CarouselRun run(){
        executed = true;
        if(running) return null;
        running = true;
        return new CarouselRun();
    }
}
