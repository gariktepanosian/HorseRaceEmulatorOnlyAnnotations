package com.example.horseraceemulatoronlyannotations.config;


import com.example.horseraceemulatoronlyannotations.beans.Horse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {

    @Bean
    public List<Horse> getHorses() {
        List<Horse> horseList = new ArrayList<>();
        Horse horse1 = new Horse("Arabic", 1, "Mahmud");
        Horse horse2 = new Horse("English", 2, "John");
        Horse horse3 = new Horse("Scottish", 3, "McTominay");
        Horse horse4 = new Horse("Welsh", 4, "Bale");
        Horse horse5 = new Horse("New Zealander", 5, "Jack");
        horseList.add(horse1);
        horseList.add(horse2);
        horseList.add(horse3);
        horseList.add(horse4);
        horseList.add(horse5);
        return horseList;
    }
}
