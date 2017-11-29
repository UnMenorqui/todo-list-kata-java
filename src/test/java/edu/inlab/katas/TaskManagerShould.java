package edu.inlab.katas;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TaskManagerShould {

    private TaskManager taskManager;

    @Before
    public void setUp(){
        taskManager = new TaskManager();
    }


    @Test
    public void addTaskWhenMethodIsCalled() {
        String task = "hola";

        Task t = taskManager.addTask(task);

        assertEquals(task, t.getTask());
        assertEquals(false, t.getDone());
    }

    @Test
    public void getTasks(){
        String task = "hola";
        Task t = taskManager.addTask(task);

        List<Task> tasksList = taskManager.getTasks();

        assertEquals(tasksList.get(0).getTask(), task);
    }

    @Test
    public void MarkTaskasDone() {
        Task t = new Task("adeu", false);
        t.markasDone();
        assertEquals(true, t.getDone());
    }




    /*@Test
    public void printTasks() {
        Task task1 = new Task(1, "Tasca 1", false);

        TaskManager taskManager = new TaskManager();
        taskManager.add(task1);

        TaskManager.printTasks();

        assertThat()

        assertTrue(true);
        assertFalse(false);
        assertEquals(true, true);
        assertEquals(false, false);
        assertThat(true, is(true));
        assertThat(false, is(false));
    }*/
}
