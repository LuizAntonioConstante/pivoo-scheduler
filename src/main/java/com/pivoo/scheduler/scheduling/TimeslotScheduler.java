package com.pivoo.scheduler.scheduling;

import com.pivoo.scheduler.service.SchedulerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class TimeslotScheduler {

    private final SchedulerService schedulerService;

    public TimeslotScheduler(SchedulerService schedulerService){
        this.schedulerService = schedulerService;
    }

    @Scheduled(fixedDelay = 10000)
    public void schedule(){

        schedulerService.checkTimeslots();

        schedulerService.testLate();

        log.info("schedule and execute at {}", LocalDateTime.now());


    }

}
