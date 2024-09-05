package com.calamares.nun_habit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.calamares.nun_habit.model.Habit;
import com.calamares.nun_habit.service.HabitService;

@RestController
@RequestMapping("/api")
public class HabitController {

    @Autowired
    public HabitService habitService;

    @PostMapping("/habits")
    @ResponseStatus(HttpStatus.OK)
    public Habit addHabit(@RequestBody Habit newHabit) {
        habitService.addHabit(newHabit);
        return newHabit;
    }

}
