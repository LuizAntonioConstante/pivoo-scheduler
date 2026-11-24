package com.pivoo.scheduler.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class SchedulerService {


    public void checkTimeslots(){

        System.out.println("Verifying the timeslots...");
    }

    public void testLate() {

        LocalDate scheduleDate = LocalDate.of(2026, 10, 20);
        LocalDate scheduleNewDate = calculateNextDate(scheduleDate);

        System.out.println("The schedule date is: " + scheduleDate);
        System.out.println("The schedule new date is: " + scheduleNewDate);

    }

    public LocalDate calculateNextDate(LocalDate scheduleDate){

        LocalDate scheduleNewDate = scheduleDate;

        while (scheduleNewDate.isBefore(LocalDate.now())){

            scheduleNewDate = scheduleNewDate.plusWeeks(1);
        }
        return scheduleNewDate;

    }

}
