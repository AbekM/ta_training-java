package com.epam.training.Asilbek_Makhmudov.gradually_decreasing_carousel;

public class Main {
    public static void main(String[] args){
        DecrementingCarousel carousel = new GraduallyDecreasingCarousel(7);
        carousel.addElement(3);
        carousel.addElement(7);
        carousel.addElement(4);
        CarouselRun run = carousel.run();
        System.out.println(run.isFinished()); //false
        System.out.println(run.next()); //20
        System.out.println(run.next()); //30
        System.out.println(run.next()); //10
        System.out.println(run.next()); //19
        System.out.println(run.next()); //29
        System.out.println(run.next()); //9
        System.out.println(run.next()); //17
        System.out.println(run.next()); //27
        System.out.println(run.next()); //7
        System.out.println(run.next()); //14
        System.out.println(run.isFinished()); //true
    }
}
