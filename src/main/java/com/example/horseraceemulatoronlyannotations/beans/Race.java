package com.example.horseraceemulatoronlyannotations.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component(value = "Race")
public class Race {
    @Value("10")
    private long length;
    @Value("#{T(java.time.LocalDate).parse('2022-05-31')}")
    private LocalDate date;

    private List<Horse> horses;

    @Autowired
    public Race(List<Horse> horses) {
        this.horses = horses;
    }

    public Horse getWinner() {
        Random random = new Random();
        int low = 1;
        int high = 6;
        int res = random.nextInt(high - low) + low;
        for (Horse horse1 : horses) {
            if (res == horse1.getRaceNumber()) {
                return horse1;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Race " +
                " length= " + length +
                "  date= " + date + '\n' +
                " horse= " + horses;
    }
}
