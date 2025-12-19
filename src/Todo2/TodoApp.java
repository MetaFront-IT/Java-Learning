package Todo2;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    private ArrayList<Task> tasks = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public TodoApp() {
        menu();
    }

    public void menu() {
        aa:
        while (true) {
            System.out.println("1 for add task");
            System.out.println("2 for remove task");
            System.out.println("3 for show task");
            System.out.println("3 for Toggle task");
            System.out.println("4 for Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter task Title");
                String title = sc.next();
                System.out.println("Enter task Priority");
                int priority = sc.nextInt();
                addTask(title, priority);
            } else if (choice == 2) {
                removeTask();
            } else if (choice == 3) {
                showTasks();
            } else if (choice == 4) {
                toggleDone();
            } else if (choice == 5) {
                break aa;
            }
        }
    }

    public void addTask(String title, int priority) {
        tasks.add(new Task(title, priority));
    }

    public void removeTask() {
        showTasks();
        int index = sc.nextInt();
        tasks.remove(index - 1);
    }

    public void toggleDone() {
        showTasks();
        int index = sc.nextInt();
        tasks.get(index-1).toggleDone();
    }

    public void showTasks() {
        for (int i = 0;  i < tasks.size(); ++i) {
            System.out.println(i+ 1 + " " + tasks.get(i));
            System.out.println();
        }
    }
}
