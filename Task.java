/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    private String developerName;
    private String taskName;
    private String taskID;
    private int taskDuration;
    private String taskStatus;

    public Task(String developerName, String taskName, String taskID, int taskDuration, String taskStatus) {
        this.developerName = developerName;
        this.taskName = taskName;
        this.taskID = taskID;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskID() {
        return taskID;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public String displayTaskDetails() {
        return "Task Name: " + taskName + "\n"
             + "Developer: " + developerName + "\n"
             + "Task ID: " + taskID + "\n"
             + "Duration: " + taskDuration + " hours\n"
             + "Status: " + taskStatus + "\n";
    }
}
