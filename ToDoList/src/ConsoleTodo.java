import java.text.SimpleDateFormat;
import java.util.*;

public class ConsoleTodo {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте");
        for (; ; ) {
            System.out.println("Выберите действие: \nДобавить задачу\nУдалить задачу\nИзменить статус задачи\nВывести весь список задач\nВыполнить отчет по задачам");
            String choice = scanner.nextLine();
            switch (choice) {
                case "Добавить задачу":
                    System.out.println("Напишите текст задачи:");
                    String textTask = scanner.nextLine();
                    System.out.println("Введите дату, к которой задача должна быть выполнена:");
                    System.out.println("год");
                    int year = scanner.nextInt();
                    System.out.println("месяц");
                    int month = scanner.nextInt();
                    System.out.println("число");
                    int date = scanner.nextInt();
                    System.out.println("Введите id задачи");
                    int idTask = scanner.nextInt();
                    Task task = new Task();
                    task.setStatus("новая");
                    task.setDate(year, month, date);
                    task.setText(textTask);
                    taskList.addTask(idTask, task);
                    break;
                case "Удалить задачу":
                    System.out.println("Введите id задачи, которую вы хотите удалить");
                    int idDelete = scanner.nextInt();
                    //taskList.getTask(taskDelete);
                    taskList.removeTask(idDelete);
                    break;
                case "Изменить статус задачи":
                    System.out.println("Введите id задачи,статус которой вы хотели бы изменить");
                    int idChangeStatus = scanner.nextInt();
                    System.out.println("Введите новый статус задачи:\n в работе \n сделано");
                    String newStatus = scanner.nextLine();
                    taskList.getTask(idChangeStatus).setStatus(newStatus);
                    break;
                case "Вывести весь список задач":
                    taskList.printTaskList();
                    break;
            }

        }
    }
}