package com.todos.todos;

import java.util.Date;

public class Task {
    private String name="";
    private Boolean completed;
    private Date dueDate;

    public Task(String name, boolean isCompleted, Date dueDate){
        this.name = name;
        this.completed = isCompleted;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public Boolean isCompleted() {
        return completed;
    }

    public Date getDueDate() {
        return dueDate;
    }
}
