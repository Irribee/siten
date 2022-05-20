public interface Doing {
    public boolean addTask(Task textTask);

    public boolean removeTask(Task textTask);

    public void setStatus(Task statusTask);

    public Task getTaskList();

    public String report();
}
