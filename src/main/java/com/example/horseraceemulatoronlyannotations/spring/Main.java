package com.example.horseraceemulatoronlyannotations.spring;

import com.example.horseraceemulatoronlyannotations.beans.Horse;
import com.example.horseraceemulatoronlyannotations.beans.Race;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("com.example");
        Race race = context.getBean("Race", Race.class);
        System.out.println(race);
        Horse horse = race.getWinner();
        System.out.println("Winner is the " + horse.getRider() + " by the " + horse.getBreed() + " horse " + "with the race number " + horse.getRaceNumber());
    }
}
