import java.util.Calendar;

public class Task {
    //public static void main(String[] args) {
    private static int nextId = 1;

    private int id;
    private Calendar date;
    private String text;
    private String status;

    public Task(int id, Calendar date, String text, String status) {
        this.id = id;
        this.date = date;
        this.text = text;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public Calendar getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public String getStatus() {
        return status;
    }

    public static void main(String[] args) {

    }
}
