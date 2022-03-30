package com.example.horseraceemulatoronlyannotations.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Horse {
    private String breed;
    private int raceNumber;
    private String rider;

    @Override
    public String toString() {
        return "Horse " +
                " breed= " + breed +
                " raceNumber= " + raceNumber +
                " rider= " + rider + '\n';
    }
}
