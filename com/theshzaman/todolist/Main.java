package com.theshzaman.todolist;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Task task1 = createTask("Learn Java");

        Task task2 = createTask("Write first program in Java");

    }

    public static Task createTask(String taskTitle) {
        Task newTask = new Task(taskTitle);
        return newTask;
    }

}