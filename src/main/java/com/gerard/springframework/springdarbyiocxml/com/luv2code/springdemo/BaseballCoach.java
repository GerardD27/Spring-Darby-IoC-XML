package com.gerard.springframework.springdarbyiocxml.com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
