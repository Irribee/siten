import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ConsoleTodo {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        // Task textTask=new Task;
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
                    Calendar finishDay = new GregorianCalendar(year, month, date);
                    //taskList.setStatus("new");неправильно
                    String task = new Task(textTask, finishDay); //как в конструктор здесь добавить статус и id, ведь он присваивается уже объекту, а если их вообще не писать в конструктор, то как можно поменять статус?
                    taskList.addTask(task);
                    break;
                case "Удалить задачу":
                    System.out.println("Введите текст задачи, которую вы хотите удалить");
                    String taskDelete = scanner.nextLine();
                    taskList.removeTask(taskDelete);
                    break;
                case "Изменить статус задачи":
                    System.out.println("Введите текст задачи,статус которой вы хотели бы изменить");
                    String taskStatus = scanner.nextLine();
                    taskList.getStatus(taskStatus);//неправильно
                    System.out.println("Введите новый статус задачи");
                    String taskChangeStatus = scanner.nextLine();
                    taskList.setStatus(taskChangeStatus);//неправильно
                    break;
                case "Вывести весь список задач":
                    taskList.getTaskList();
                    break;

            }
        }
    }
}