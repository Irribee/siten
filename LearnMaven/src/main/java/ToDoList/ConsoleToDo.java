package ToDoList;

import ToDoList.Task;
import ToDoList.TaskList;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.*;

class ConsoleTodo {
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
                    if (StringUtils.isEmpty(textTask)) {
                        System.out.println("Введите текст задачи, поле не должно быть пустым");
                    }
                    System.out.println("Введите дату, к которой задача должна быть выполнена:");
                    System.out.println("год");
                    int year = scanner.nextInt();
                    if (StringUtils.isEmpty(String.valueOf(year))) {
                        System.out.println("Введите год, поле не должно быть пустым");
                    }
                    System.out.println("месяц");
                    int month = scanner.nextInt();
                    if (StringUtils.isEmpty(String.valueOf(month))) {
                        System.out.println("Введите месяц, поле не должно быть пустым");
                    }
                    System.out.println("число");
                    int date = scanner.nextInt();
                    if (StringUtils.isEmpty(String.valueOf(date))) {
                        System.out.println("Введите число, поле не должно быть пустым");
                    }
                    System.out.println("Введите id задачи");
                    int idTask = scanner.nextInt();
                    if (StringUtils.isEmpty(String.valueOf(idTask))) {
                        System.out.println("Введите id задачи, поле не должно быть пустым");
                    }
                    Task task = new Task();
                    task.setStatus("новая");
                    task.setDate(year, month, date);
                    task.setText(textTask);
                    taskList.addTask(idTask, task);
                    break;
                case "Удалить задачу":
                    System.out.println("Введите id задачи, которую вы хотите удалить");
                    int idDelete = scanner.nextInt();
                    if (StringUtils.isEmpty(String.valueOf(idDelete))) {
                        System.out.println("Введите id задачи, поле не должно быть пустым");
                    }
                    taskList.removeTask(idDelete);
                    break;
                case "Изменить статус задачи":
                    System.out.println("Введите id задачи,статус которой вы хотели бы изменить");
                    int idChangeStatus = scanner.nextInt();
                    if (StringUtils.isEmpty(String.valueOf(idChangeStatus))) {
                        System.out.println("Введите id задачи, поле не должно быть пустым");
                    }
                    System.out.println("Введите новый статус задачи:\n в работе \n сделано");
                    String newStatus = scanner.nextLine();
                    if (StringUtils.isEmpty(newStatus)) {
                        System.out.println("Введите статус задачи, поле не должно быть пустым");
                    }
                    taskList.getTask(idChangeStatus).setStatus(newStatus);
                    break;
                case "Вывести весь список задач":
                    taskList.printTaskList();
                    break;
            }
            if (StringUtils.isEmpty(choice)) {
                System.out.println("Введите команду");
            }
        }
    }
}
