package com.gerard.springframework.springdarbyiocxml.com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune() ;
    }
}
