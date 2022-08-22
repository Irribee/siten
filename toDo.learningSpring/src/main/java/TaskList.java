import java.util.HashMap;

public class TaskList {

    HashMap<Integer, Task> taskList = new HashMap<Integer, Task>();

    public boolean addTask(int idTask, Task textTask) {
        taskList.put(idTask, textTask);
        return true;
    }

    public Task getTask(int taskId) {
        Task desiredTask = taskList.get(taskId);
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