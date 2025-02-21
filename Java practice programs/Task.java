/*
ArrayList Operations in Java
Code Assignment:

On the right hand side, you have couple of classes with the name Task and TaskManager.

Inside the TaskManager class, there is a static method makeToDoList() that accepts no input parameters and return List<Task>

Follow the below instructions to complete this assignment,

1) First understand the POJO class Task.java and using the same inside the makeToDoList() method , create an ArrayList with three tasks namely "Complete assignment", "Go for a run", "Buy groceries".

2) By default all the tasks inside the list are going to have completed boolean variable as false. For the second task in the list "Go for a run", update the completed boolean variable as true.

3) Iterate all the elements inside the list and using the task details, display the below content on to the console,

1. Complete assignment - Completed: false
2. Go for a run - Completed: true
3. Buy groceries - Completed: false
4) At last return the list from the method

Expected Output:

[Task{description='Complete assignment', completed=false},
Task{description='Go for a run', completed=true},
Task{description='Buy groceries', completed=false}]*/
public class Task {
    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
