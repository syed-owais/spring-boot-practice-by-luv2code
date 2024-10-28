package com.fyxify.practice.common;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor swim coach");
    }

    @Override
    public String getDailyWorkout() {
        return "Swim bht bht.";
    }
}
