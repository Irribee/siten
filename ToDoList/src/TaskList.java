import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskList {

    HashMap<Integer, Task> taskList = new HashMap<>();

    public boolean addTask(int idTask, Task textTask) {
        taskList.put(idTask, textTask);
        return true;
    }

    public Task getTask(int taskId) {
        Task desiredTask = taskList.get(taskId);
        return desiredTask;
    }
//        Task desiredTask = null;
//        for (int i = 0; i < taskList.size(); i++) {
//            if (i == taskId - 1) {
//                desiredTask = taskList.get(i);
//            }
//        }
//        return desiredTask;
//    }

    public void removeTask(int idRemove) {
        taskList.remove(idRemove);

    }

    public void printTaskList() {
        System.out.println(taskList);
    }

    public String report() {

        return null;
    }
}