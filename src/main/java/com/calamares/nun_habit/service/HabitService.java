package com.calamares.nun_habit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import com.calamares.nun_habit.model.Habit;

// nessa classe ficam os métodos principais
@Service
public class HabitService {
    
    List<Habit> habits = new ArrayList<>();

    public void addHabit(Habit habit) {
        habits.add(habit);
    }

    public void markAsCompleted(Long id) {
        for (Habit habit : habits) {
            if (habit.getId().equals(id)) {
                habit.setCompleted(true);
                break;
            }
        }

    }

    public Habit findHabitById(Long id) {

        for (Habit habit : habits) {
            if (habit.getId().equals(id)) {
                return habit;
            }
        }
        return null;
    }

    public void printHabitDetails(Long id) {
        Habit habit = findHabitById(id);
        if (habit != null) {
            System.out.println(habit);
        } else {
            System.out.println("Habit not found.");
        }
    }

    public List<Habit> listAllHabits() {
        return habits;
    }

    public List<Habit> listOnlyCompleted() {
        List<Habit> completedHabits = new ArrayList<>();

        for (Habit habit : habits) {
            if (habit.isCompleted() == true) {
                completedHabits.add(habit);
            }
        }
        return completedHabits;
    }

    public List<Habit> listHabitsTodo() {
        List<Habit> habitsToDo = new ArrayList<>();

        for (Habit habit : habits) {
            if (!habit.isCompleted()) {
                habitsToDo.add(habit);
            }
        }
        return habitsToDo;
    }

}
