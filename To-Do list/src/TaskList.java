import java.util.ArrayList;
import java.util.Scanner;

public class TaskList extends Task {

    ArrayList<String> taskList = new ArrayList<>();

    public boolean addTask(String textTask) {
        taskList.add(textTask);
        return true;
    }


    public boolean removeTask(String taskRemove) {
        taskList.remove(taskRemove);
        return true;
    }


    public void setStatus(String taskChangeStatus) {

        status = taskChangeStatus;
    }


    public String getTaskList() {
        String list = null;
        for (String t : taskList) {
            list = t;
            System.out.println(list);
        }
        return list;
    }


    public String report() {

        return null;
    }
}