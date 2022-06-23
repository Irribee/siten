package ToDoList;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task {

    static int nextId = 1;
    int id;
    GregorianCalendar date;
    String text;
    String status;

    public int getId() {

        return id;
    }

    public void setId(int giveId) {

        id = giveId;
    }

    public void setDate(int year, int month, int dayOfMonth) {
        GregorianCalendar date = new GregorianCalendar();
        date.set(Calendar.YEAR, year);
        date.set(Calendar.MONTH, month);
        date.set(Calendar.DAY_OF_MONTH, dayOfMonth);

    }

    public Calendar getDate() {
        return date;
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

    public void setStatus(String s) {

        status = s;
    }

    @Override
    public String toString() {
        return getId() + getText();
    }
}