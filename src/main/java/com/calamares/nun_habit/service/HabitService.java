package com.calamares.nun_habit.service;

import java.util.List;
import java.util.ArrayList;
import com.calamares.nun_habit.model.Habit;

// nessa classe ficam os métodos principais
public class HabitService {
    
    List<Habit> habits = new ArrayList<>();

    public List<Habit> addHabit(Habit habit) {
        habits.add(habit);
        return habits;
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

}
