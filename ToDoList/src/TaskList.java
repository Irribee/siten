import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {

    ArrayList<Task> taskList = new ArrayList<>();

    public boolean addTask(String textTask) {
        taskList.add(textTask);
        return true;
    }


    public boolean removeTask(String taskRemove) {
        taskList.remove(taskRemove);
        return true;
    }


//    public void setStatus(String taskChangeStatus) {
//      String  status = taskChangeStatus;
//    }


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