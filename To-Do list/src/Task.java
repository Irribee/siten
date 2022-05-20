import java.util.Calendar;
import java.util.GregorianCalendar;

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

    public void setDate(int year, int month, int dayOfMonth) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

    }

    public String getText() {

        return text;
    }

    public void setText(String t) {
        text = t;
    }

    public String getStatus() {

        return status;
    }
}
