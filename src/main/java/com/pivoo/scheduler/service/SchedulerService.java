package com.pivoo.scheduler.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class SchedulerService {


    public void checkTimeslots(){

        System.out.println("Verifying the timeslots...");

        List<LocalDate> schedules = List.of(
                LocalDate.of(2026,10,20),
                LocalDate.of(2026,11,5),
                LocalDate.of(2026,11,18),
                LocalDate.of(2026,11,2)
        );

        List<LocalDate> schedulesNew = new ArrayList<>();

        for (LocalDate date : schedules){
            LocalDate scheduleNewDate = calculateNextDate(date);
            schedulesNew.add(scheduleNewDate);
        };

        System.out.println(schedulesNew);


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
