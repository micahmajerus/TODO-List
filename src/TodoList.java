import java.util.ArrayList;

/**
 * Represents a user's to-do list for managing tasks and staying organized.
 *
 * This class stores a list of `Task` objects and provides functionality for:
 * * **Creating a new to-do list** with an owner and name.
 * * **Adding, removing, and accessing tasks** within the list.
 * * **Displaying a formatted list** of tasks for the user.
 *
 */
public class TodoList {

    private User owner;
    private ArrayList<Task> tasks;

    private String todoListName;


    /**
     * Constructs a new TodoList object with the specified owner and name.
     *
     * @param owner The User object representing the owner of the TodoList.
     * @param todoListName The String representing the name of the TodoList.
     *
     * This constructor creates a new TodoList instance with:
     * * An empty list of tasks.
     * * The specified owner object associated with the list.
     * * The provided name assigned to the TodoList.
     *
     * Note that this constructor does not create any initial tasks for the list. Tasks can be added later using the `addTask` method.
     */
    public TodoList(User owner, String todoListName) {
        this.todoListName = todoListName;
        this.owner = owner;
        this.tasks = new ArrayList<>();
    }

    /**
     * Returns the owner
     */
    public User getOwner() {
        return owner;
    }

    /**
     * Prints the tasks
     */
    public void getTasks() {
        System.out.println(tasks);
    }

    /**
     * Allows adding tasks to the list
     * @param task - The task to be added
     */
    public void addTask(Task task) {
        if (task != null) {
            tasks.add(task);
        } else {
            System.err.println("Cannot add null task!");
        }
    }

    /**
     * Allows remove of tasks from a todolist
     * @param task - The Task to be removed
     */
    public void removeTask(Task task) {
        if (task != null) {
            tasks.remove(task);
        } else {
            System.err.println("Cannot remove null task!");
        }
    }


    /**
     * @return - A list of tasks in the todolist
     */
    public String displayList() {
        String listDisplay = "**" + owner.getName() + "'s " + todoListName + ":**\n";
        for (Task task : tasks) {
            listDisplay += "- " + task.getTaskDetail() + "\n";
        }
        return listDisplay;
    }
}
