package edu.inlab.katas;

/**
 * Created by jordi.casanovas on 29/11/2017.
 */
public class Task {
    private String task;
    private Boolean done;

    public Task(String task, Boolean done) {
        this.task = task;
        this.done = done;
    }


    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
