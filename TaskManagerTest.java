/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {
    @Test
    void testGenerateTaskID() {
        String taskID = TaskManager.generateTaskID("Create Login", "Mike Smith", 0);
        assertEquals("CR:0:ITH", taskID);
    }
}
