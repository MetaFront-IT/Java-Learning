package Todo2;

public class Task {
    private String title;
    private int priority;
    private boolean done = false;



    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
        this.done = done;
    }

    public void toggleDone() {
        done = !done;
    }

    public String toString() {
        return "Title: " + title + " Priority: " + priority + " Is Done: " + done;
    }
}
