import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

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
                    taskList.addTask(textTask);
                    System.out.println("Введите дату, к которой задача должна быть выполнена:");
                    System.out.println("год");
                    int year = scanner.nextInt();
                    System.out.println("месяц");
                    int month = scanner.nextInt();
                    System.out.println("число");
                    int date = scanner.nextInt();
                    taskList.setDate(year, month, date);
                    taskList.setId();

                    taskList.setStatus("new");
                    break;
                case "Удалить задачу":
                    System.out.println("Введите текст задачи, которую вы хотите удалить");
                    String taskDelete = scanner.nextLine();
                    taskList.removeTask(taskDelete);
                    break;
                case "Изменить статус задачи":
                    System.out.println("Введите текст задачи,статус которой вы хотели бы изменить");
                    String taskStatus = scanner.nextLine();
                    taskList.getStatus();
                    System.out.println("Введите новый статус задачи");
                    String taskChangeStatus = scanner.nextLine();
                    taskList.setStatus(taskChangeStatus);
                    break;
                case "Вывести весь список задач":
                    taskList.getTaskList();
                    break;

            }
        }
    }
}
