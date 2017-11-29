package edu.inlab.katas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jordi.casanovas on 29/11/2017.
 */
public class TaskManager {

    List<Task> taskList;

    public TaskManager() {
        taskList = new ArrayList<>();
    }

    public  Task addTask(String task) {
        Task t = new Task(task, false);
        taskList.add(t);
        return t;
    }

    public List<Task> getTasks() {
        return taskList;
    }
}
