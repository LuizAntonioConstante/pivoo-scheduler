package com.pivoo.scheduler.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SchedulerService {


    public void checkTimeslots(){

        System.out.println("Verificando os timeslots...");
    }

    public void testLate(){

        LocalDate scheduleDate = LocalDate.of(2026, 11, 9);
        LocalDate testDate = LocalDate.of(2026, 11, 19);

        boolean late = scheduleDate.isBefore(testDate);

        if(late){
            System.out.println("This Schedule is late");
        }
        else{
            System.out.println("This Schedule is correct");
        }

    }

}
