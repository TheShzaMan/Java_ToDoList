package com.theshzaman.todolist;

// import java.time.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    public String dateCreated;
    private String dueDate;
    private String title;
    private String description;
    private Boolean isComplete;

    public Task(String title) {
        dateCreated = stampDate();
        title = this.title;
        isComplete = false;
    }

    private String stampDate() {
        // LocalDate date = LocalDate.now();
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh mm ss nnnn");
        String dateString = date.format(formatter);
        System.out.println("Task created at: " + dateString);
        return dateString;
    }

    public void completeTask() {
        isComplete = true;
    }

}
