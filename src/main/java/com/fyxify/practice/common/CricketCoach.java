package com.fyxify.practice.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    // define our init method
    @PostConstruct
    public void doAnything(){
        System.out.println("Cricket Coach post construct: "+ getClass().getSimpleName());
    }

    // define our destroy method
    @PreDestroy
    public void doAnythingToCleanup(){
        System.out.println("Cricket Coach destroy: "+ getClass().getSimpleName());
    }

    public CricketCoach() {
        System.out.println("Cricket Coach");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for Cricket Coach for 15 minutes!! Ok";
    }
}