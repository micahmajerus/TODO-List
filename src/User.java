/**
 * Represents a user with a personal to-do list for managing tasks and staying organized.
 *
 * Users can interact with their to-do lists through methods like:
 * * **Viewing list details:** Printing the user's name and associated to-do list information.
 * * **Accessing the list:** Retrieving the user's to-do list object for further manipulation.
 * * **Adding a list:** Assigning a new to-do list to the user.
 * * **Displaying the list contents:** Printing a formatted overview of the user's tasks.
 *
 * This class provides a basic framework for managing individual users and their associated tasks within a larger to-do list system.
 */
public class User {

    private String name;
    private TodoList todoList;

    /**
     * Creates a new User object with the specified name.
     *
     * @param name The String representing the User's name.
     *
     * This constructor initializes a new User instance with the provided name as its only attribute.
     *
     * Note that this constructor does not currently set any additional information about the User,
     * such as email address, password, or preferences. These functionalities may be added later
     * depending on your specific needs.
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * @return - The name of the user
     */
    public String getName() {
        return name;
    }

    /**
     * @return - The todolist associated with the user
     */
    public TodoList getTodoList() {
        return todoList;
    }

    /**
     * Gives a user a todolist
     * @param todoList - The todolist we want to user to have
     */
    public void setTodoList(TodoList todoList) {
        this.todoList = todoList;
    }

    /**
     * If the user has a todolist assigned we will show the contents
     */
    public void displayTodoList() {
        if (todoList != null) {
            System.out.println(todoList.displayList());
        } else {
            System.out.println(name + " doesn't have a todo list yet.");
        }
    }

    /**
     * The details of the given user
     */
    public void getUserDetails() {
        System.out.println("User Details" + "\nUser Name: " + name + "\nUser TODO List: " + todoList + "\n");
    }
}
