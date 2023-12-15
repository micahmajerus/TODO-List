public class Main {
    public static void main(String[] args) {

        // Creating the users
        User Micah = new User("Micah");
        User Sam = new User("Sam");

        //Creating the todolist and assigning an owner
        TodoList Micah_ToDoList1 = new TodoList(Micah, "Micah's List 1");
        TodoList Sam_ToDoList = new TodoList(Sam, "Sam's List 1");

        // Creating some tasks to add to Micah's list
        Task Mow_Lawn = new Task("Mow Lawn", false);
        Task Brush_Teeth = new Task("Brush Teeth", "Brush your teeth very well", false );

        // Creating some tasks to add to Sam's list
        Task Garbage = new Task("Take the garbage out", "Put them o the side of the house", "1/12/23", false);
        Task Pick_up = new Task("Pick up luke", true);

        // Adding the tasks to Micah's list 1
        Micah_ToDoList1.addTask(Mow_Lawn);
        Micah_ToDoList1.addTask(Brush_Teeth);

        // Adding the tasks to Sam's list 1
        Sam_ToDoList.addTask(Garbage);
        Sam_ToDoList.addTask(Pick_up);
        Sam_ToDoList.addTask(Mow_Lawn);

        // Getting the details of the user
        Micah.setTodoList(Micah_ToDoList1);
        Micah.getUserDetails();

        Sam.setTodoList(Sam_ToDoList);
        Sam.getUserDetails();

        // Showing all the tasks for the given user
        Micah.displayTodoList();
        Sam.displayTodoList();

        // Removing one of Sam's tasks
        Sam_ToDoList.removeTask(Garbage);
        Sam.displayTodoList();

        // Adding another task to Micah's list per requirements
        Task BuyFood = new Task("Buy Food", "Make sure to buy the bread", false);
        Micah_ToDoList1.addTask(BuyFood);
        Micah.displayTodoList();
    }
}