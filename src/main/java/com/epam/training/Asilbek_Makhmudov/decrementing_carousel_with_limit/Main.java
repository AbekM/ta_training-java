package com.epam.training.Asilbek_Makhmudov.decrementing_carousel_with_limit;

public class Main {
    public static void main(String[] args){
        DecrementingCarouselWithLimitedRun carousel = new DecrementingCarouselWithLimitedRun(7, 10);

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
        System.out.println(run.next()); //-1
        System.out.println(run.isFinished()); //true


    }
}
