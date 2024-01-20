package com.theshzaman.todolist;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        TheList myList = createTheList("MyToDo's");

        createTask("Learn Java", myList);

        createTask("Write first program in Java", myList);

    }

    public static TheList createTheList(String listName) {
        return new TheList(listName);
    }

    public static Task createTask(String taskTitle, TheList list) {
        Task newTask = new Task(taskTitle);
        list.addTask(newTask);
        return newTask;
    }

}