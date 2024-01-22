
import java.io.Console;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.swing.GroupLayout.Alignment;

import org.apache.commons.lang3.StringUtils;

public class Main {

    // Console console = System.console();

    public static void main(String[] args) {

        displayOpening();
        // console.readLine("press enter %s", "");

        TheList myList = createTheList("MyToDo's");

        createTask("Learn Java", myList);

        createTask("Write first program in Java", myList);
        displayTasks(myList.getAllTasks());
    }

    public static void displayOpening() {
        Console console = System.console();
        if (console == null) {
            System.out.println(
                    "No console available");
            return;
        }
        String title = StringUtils.center(" Java_ToDoList ", 100);
        String description = StringUtils.center(" A simple console app to create and track your To-Dos ", 100);
        // int totalWidthT = 15, totalWidthD = 54;
        // System.out.printf();
        console.readLine("%35s%n %46s%n%n ** press enter ** ", title, description);

    }

    public static String padLeft(String s, int n) {
        return String.format("%" + n + "s", s);
    }

    public static void displayTasks(List<Task> tasksToDisplay) {
        int count = tasksToDisplay.size();
        for (int i = 0; i < count; i++) {
            // String date = StringUtils.leftPad(tasksToDisplay.get(i).dateCreated, 50);
            // StringAlignment rightAlignment = new StringAlignment(15, Alignment.RIGHT);
            String d = (padLeft(tasksToDisplay.get(i).dateCreated, 20));
            System.out.printf("%n%d .) %s %s%n%n", i + 1, tasksToDisplay.get(i).title, d);
        }
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