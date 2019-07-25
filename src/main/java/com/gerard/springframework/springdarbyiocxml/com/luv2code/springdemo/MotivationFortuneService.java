package com.gerard.springframework.springdarbyiocxml.com.luv2code.springdemo;

import java.util.Random;

public class MotivationFortuneService implements FortuneService {
    private String[] fortunes = {
            "You can do this!!",
            "Don't give up!!",
            "Believe in yourself!!"
    };
    @Override
    public String getFortune() {
        Random random = new Random();
        return fortunes[random.nextInt(fortunes.length)];
    }
}
