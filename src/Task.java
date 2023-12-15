public class Task {
    private String name;
    private String description;
    private String dueDate;
    private boolean isDone;

    /**
     * @constructor
     * @param name - The name of the task
     * @param isDone - The status of the task true means the task is done
     */
    public Task(String name, boolean isDone) {
        this.name = name;
        this.isDone = isDone;
    }

    /**
     * @constructor
     * @param name - The name of the task
     * @param description - Short description of the task
     * @param isDone - The status of the task true means the task is done
     */
    public Task(String name, String description, boolean isDone) {
        this(name, isDone);
        this.description = description;
    }

    /**
     * @constructor
     * @param name - The name of the task
     * @param description - Short description of the task
     * @param dueDate - The date the task needs to be done by
     * @param isDone - The status of the task true means the task is done
     */
    public Task(String name, String description, String dueDate, boolean isDone) {
        this(name, description, isDone);
        this.dueDate = dueDate;
    }

    //Getters-----------------------------------------------------------------------------------------------------------

    /**
     * @return - The name of the task
     */
    public String getName() {
        return name;
    }

    /**
     * @return - The description of the task
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return - The due date of the task
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * @return - If the task is done
     */
    public boolean getIsDone() {
        return isDone;
    }

    /**
     * Formats and returns a detailed String representation of the current Task object.
     *
     * @return A String containing the Task name, description, due date, and completion status.
     *
     * This method formats the Task information into a readable format, including:
     * * Task name
     * * Task description (if present)
     * * Task due date (if present)
     * * Task completion status ("Complete" or "Not Done")
     *
     * The displayed completion status is based on the value of the `isDone` field.
     *
     * Note that this method does not modify the state of the Task object.
     */
    public String getTaskDetail() {
        // Making whether the task is done easier to read
        String isTaskComplete;
        if (this.isDone) {
            isTaskComplete = "Complete";
        }
        else {
            isTaskComplete = "Not Done";
        }

        return "Task Name: " + this.name + "\nTask Description: " + this.description + "\nTask Due Date: " + this.dueDate + "\nTask Status: " + isTaskComplete + "\n" ;
    }
}

