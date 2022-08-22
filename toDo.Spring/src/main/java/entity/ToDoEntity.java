package entity;

import javax.persistence.*;
import java.util.GregorianCalendar;

@Entity
public class ToDoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    GregorianCalendar date;
    String text;
    String status;
    @OneToOne
            @JoinColumn(name="task_id")
TaskEntity task;
public ToDoEntity(){

}

    public void setTask(TaskEntity task) {
        this.task = task;
    }

    public TaskEntity getTask() {
        return task;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public boolean getStatus() {
        return status;
    }
}
