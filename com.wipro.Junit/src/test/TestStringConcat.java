package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import task.DailyTasks;

public class TestStringConcat {

    @Test
    public void testDoStringConcat() {
        DailyTasks task = new DailyTasks();
        String result = task.doStringConcat("Hello", "World");
        assertEquals("Hello World", result); 
    }
}