package com.fyxify.practice.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Lazy
public class BaseballCoach implements Coach {

    public BaseballCoach(){
        System.out.println("BaseballCoach constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for Baseball Coach for 15 minutes!!";
    }
}