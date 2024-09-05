package com.calamares.nun_habit.model;

public class Habit {
    
    private Long id;
    private String name;
    private String description;
    private boolean completed;

    public Habit(
        Long id,
        String name,
        String description
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.completed = false;
    }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return this.completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return getName()+": "+getDescription()+" - Is Completed: "+isCompleted();
    }

}
