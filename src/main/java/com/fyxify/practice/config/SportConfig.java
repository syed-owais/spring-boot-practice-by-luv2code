package com.fyxify.practice.config;

import com.fyxify.practice.common.Coach;
import com.fyxify.practice.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("couldBeAnyThing")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
