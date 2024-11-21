/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void testDisplayTaskDetails() {
        // Arrange: Create a Task object
        Task task = new Task("Mike Smith", "Create Login", "CL:0:ITH", 5, "To Do");

        // Act: Call displayTaskDetails()
        String expectedDetails = """
                                 Task Name: Create Login
                                 Developer: Mike Smith
                                 Task ID: CL:0:ITH
                                 Duration: 5 hours
                                 Status: To Do
                                 """;

        // Assert: Compare the output with the expected string
        assertEquals(expectedDetails, task.displayTaskDetails());
    }
    @Test
    void testGetters() {
       // Arrange: Create a Task object
       Task task = new Task("Mike Smith", "Create Login", "CL:0:ITH", 5, "To Do");

      // Act & Assert: Verify each getter
          assertEquals("Mike Smith", task.getDeveloperName());
          assertEquals("Create Login", task.getTaskName());
          assertEquals("CL:0:ITH", task.getTaskID());
          assertEquals(5, task.getTaskDuration());
          assertEquals("To Do", task.getTaskStatus());
}

}
