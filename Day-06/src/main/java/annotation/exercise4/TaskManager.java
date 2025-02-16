package annotation.exercise4;

public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "John Doe")  // Apply annotation to a method
    public void completeTask() {
        System.out.println("Task completed.");
    }
}

