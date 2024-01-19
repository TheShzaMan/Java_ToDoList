package com.theshzaman.todolist;

// import java.time.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Task {
    public String dateCreated;
    public String title;
    private int id;
    private static int count = 1000;
    private String notes;
    private Boolean isComplete;

    public Task(String title) {
        this.id = count++;
        this.dateCreated = stampDate();
        this.title = title;
        this.isComplete = false;
    }

    private String stampDate() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM, yyyy ");
        return date.format(formatter);
        // System.out.println("Task created at: " + dateString);
    }

    public void completeTask() {
        this.isComplete = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void editTask(String editingField, String editData) {
        switch (editingField.toLowerCase()) {
            case "title":
                this.title = editData;
                break;
            case "notes":
                this.notes = editData;
                break;
            default:
                System.out.println("Invalid field specified for editing.");
        }
    }

}
