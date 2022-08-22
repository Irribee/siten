package model;

import entity.TaskEntity;

import java.util.GregorianCalendar;

public class Tasks {
    int id;
    GregorianCalendar date;
    String text;
    String status;
public static Tasks toModel(TaskEntity entity) {//конвертер, парамером принимаем энтити, а возвращаем модель
Tasks model=new Tasks();
model.setId(entity.getId());
}
public Tasks() {
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

    public String getStatus() {
        return status;
    }
}
