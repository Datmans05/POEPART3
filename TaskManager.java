/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to EasyKanban");
            System.out.println("1. Add Task");
            System.out.println("2. Display Report");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addTask(scanner);
                case 2 -> displayReport();
                case 3 -> running = false;
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Enter Developer Name: ");
        String developer = scanner.nextLine();

        System.out.print("Enter Task Name: ");
        String taskName = scanner.nextLine();

        System.out.print("Enter Task Duration (hours): ");
        int duration = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Select Task Status:\n1. To Do\n2. Doing\n3. Done");
        int statusChoice = scanner.nextInt();
        scanner.nextLine();
        String status = switch (statusChoice) {
            case 1 -> "To Do";
            case 2 -> "Doing";
            case 3 -> "Done";
            default -> "Unknown";
        };

        String taskID = generateTaskID(taskName, developer, tasks.size());
        Task newTask = new Task(developer, taskName, taskID, duration, status);
        tasks.add(newTask);
        System.out.println("Task added successfully!");
    }

    static String generateTaskID(String taskName, String developer, int taskNumber) {
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" +
               developer.substring(developer.length() - 3).toUpperCase();
    }

    private static void displayReport() {
        for (Task task : tasks) {
            System.out.println(task.displayTaskDetails());
            System.out.println("-----------------------------");
        }
    }
}
