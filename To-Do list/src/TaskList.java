import java.util.ArrayList;

public class TaskList implements Doing {
    //public static void main(String[] args) {

    //    ArrayList<Task> taskList = new ArrayList<>();
//        for (Task t : taskList) {
//            if (t.getStatus().equals("new")) {
//                t.addTask();
//            } else if (t.getStatus().equals("in progress")) {
//
//            } else if (t.getStatus().equals("done")) {
//                t.removeTask();
//            }
//            public void addTask () {
//                textTask = t.getText();
//                taskList.add(textTask);
//
//        }
//    }
    ArrayList<Task> taskList = new ArrayList<>();

    @Override
    public boolean addTask(Task textTask) {
        taskList.add(textTask);
        return true;
    }

    @Override
    public boolean removeTask(Task textTask) {
        taskList.remove(textTask);
        return true;
    }

    @Override
    public void setStatus(Task statusTask) {
//??????
    }

    @Override
    public void taskList() {
        for (Task t : taskList) {
            System.out.println(t);
        }
    }

    //        @Override
//        public String report () {
//            return null;
//        }
}