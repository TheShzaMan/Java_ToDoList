package com.theshzaman.todolist;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TheList {
    private List<Task> tasks;

    public TheList() {
        this.tasks = Arrays.asList(null);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public List<Task> getTaskByDate(String date) {
        List<Task> filteredTasks = tasks.stream()
                .filter(t -> t.getDateCreated().equalsIgnoreCase(date))
                .collect(Collectors.toList());
        return filteredTasks;
    }

    public Optional<Task> getTaskByTitle(String title) {
        Optional<Task> taskByTitle = tasks.stream()
                .filter(t -> t.getTitle().equalsIgnoreCase(title))
                .findFirst();
        taskByTitle.ifPresent(task -> {
            System.out.println("Task found:  " + task.getTitle());
        });
        return taskByTitle;
    }
}
