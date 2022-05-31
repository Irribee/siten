import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task {

    static int nextId = 1;
    int id;
    Calendar date;
    String text;
    String status;

    public int getId() {

        return id;
    }

    public void setId(int giveId) {

        id = giveId;
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

    public void setStatus(String s) {

        status = s;
    }
}