package com.toDo.Spring.ToDo;

import entity.TaskEntity;

import java.util.HashMap;

public class TaskList {

    HashMap<Integer, TaskEntity> taskList = new HashMap<>();

    public boolean addTask(int idTask, TaskEntity textTask) {
        taskList.put(idTask, textTask);
        return true;
    }

    public TaskEntity getTask(int taskId) {
        TaskEntity desiredTask = taskList.get(taskId);
        return desiredTask;
    }

    public void removeTask(int idRemove) {
        taskList.remove(idRemove);

    }

    //    public void printTaskList(Map<Integer, Task> map) {
//        for (Integer key: map.keySet()){
//        System.out.println(key+" "+map.get(key);
//    }
    public void printTaskList() {

        System.out.println(taskList);
    }
}