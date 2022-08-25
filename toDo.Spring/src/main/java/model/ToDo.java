package model;

import entity.TaskEntity;
import entity.ToDoEntity;

import java.util.GregorianCalendar;

public class ToDo {
    int id;
    GregorianCalendar date;
    String text;
    String status;

    public static ToDo toModel(ToDoEntity entity) {
        ToDo model = new ToDo();
        model.setId(entity.getId());
        model.setDate(entity.getDate());
        model.setText(entity.getText());
        model.setStatus(entity.getStatus());
        return model;
    }

    public ToDo() {
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

    public String getStatus() {
        return status;
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
}

