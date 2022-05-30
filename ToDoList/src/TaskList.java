import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {

    ArrayList<Task> taskList = new ArrayList<>();

    public boolean addTask(Task textTask) {
        taskList.add(textTask);
        return true;
    }

    public Task getTask(int taskId) {
        Task desiredTask = null;
        for (int i = 0; i < taskList.size(); i++) {
            if (i == taskId - 1) {
                desiredTask = taskList.get(i);
            }
        }
        return desiredTask;
    }

    public Task removeTask(int idRemove) {
//        for (Task t : taskList) {
//
//        }
        Task taskDelete = null;
        for (int i = 0; i < taskList.size(); i++) {
            if (i == idRemove - 1) {
                taskDelete = taskList.get(i);
                taskList.remove(taskDelete);
            }
        }
        return taskDelete;
    }

    public Task getTaskList() {
        Task list = null;
        for (Task t : taskList) {
            list = t;
            System.out.println(list);
        }
        return list;
    }


    public String report() {

        return null;
    }
}