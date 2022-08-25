package com.toDo.Spring.ToDo;
//32:00

import entity.TaskEntity;
import exceptions.TaskAlreadyException;
import exceptions.TaskNoFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.TaskService;

@RestController
@RequestMapping("/taskList")
public class TaskController {
    @Autowired //чтобы спринг внедрил объект этого класса, типа проинициализировал
    private TaskService taskService

    // @Autowired //чтобы Spring внедрил объект этого класса сюда (проинициализировал его)
    //private ListRepo listRepo;
    @PostMapping //функция будет иммитировать регистрацию пользователя
    public ResponseEntity registration(@RequestBody TaskEntity taskEntity) {  // т к это подзапрос, то данные с клиента будут передаваться в теле запроса, поэтому в параметре надо указать  тело запроса и передаем обект листа
        try {
            taskService.registration(taskEntity);
            return
                    ResponseEntity.ok("Задача успешно сохранена");
        } catch (TaskAlreadyException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity<TaskEntity> getOneTask(@RequestParam Integer id) { //параметры, кот указываются после вопросительного знака
        try {
            return
                    ResponseEntity.ok(taskService.getOne(id));
        } catch (TaskNoFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/{id}") //{}-что будем извлекать
    public ResponseEntity deleteTask(@PathVariable Integer id) { //@-переменная пути
        try {
            return
                    ResponseEntity.ok(taskService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }

    }

//                case "Добавить задачу":
//                    System.out.println("Напишите текст задачи:");
//                    String textTask = scanner.nextLine();
//                    if (StringUtils.isEmpty(textTask)) {
//                        System.out.println("Введите текст задачи, поле не должно быть пустым");
//                    }
//                    System.out.println("Введите дату, к которой задача должна быть выполнена:");
//                    System.out.println("год");
//                    int year = scanner.nextInt();
//                    if (StringUtils.isEmpty(String.valueOf(year))) {
//                        System.out.println("Введите год, поле не должно быть пустым");
//                    }
//                    System.out.println("месяц");
//                    int month = scanner.nextInt();
//                    if (StringUtils.isEmpty(String.valueOf(month))) {
//                        System.out.println("Введите месяц, поле не должно быть пустым");
//                    }
//                    System.out.println("число");
//                    int date = scanner.nextInt();
//                    if (StringUtils.isEmpty(String.valueOf(date))) {
//                        System.out.println("Введите число, поле не должно быть пустым");
//                    }
//                    System.out.println("Введите id задачи");
//                    int idTask = scanner.nextInt();
//                    if (StringUtils.isEmpty(String.valueOf(idTask))) {
//                        System.out.println("Введите id задачи, поле не должно быть пустым");
//                    }
//                    Task task = new Task();
//                    task.setStatus("новая");
//                    task.setDate(year, month, date);
//                    task.setText(textTask);
//                    taskList.addTask(idTask, task);
//                    break;
//
//                case "Изменить статус задачи":
//                    System.out.println("Введите id задачи,статус которой вы хотели бы изменить");
//                    int idChangeStatus = scanner.nextInt();
//                    if (StringUtils.isEmpty(String.valueOf(idChangeStatus))) {
//                        System.out.println("Введите id задачи, поле не должно быть пустым");
//                    }
//                    System.out.println("Введите новый статус задачи:\n в работе \n сделано");
//                    String newStatus = scanner.nextLine();
//                    if (StringUtils.isEmpty(newStatus)) {
//                        System.out.println("Введите статус задачи, поле не должно быть пустым");
//                    }
//                    taskList.getTask(idChangeStatus).setStatus(newStatus);
//                    break;
//                case "Вывести весь список задач":
//                    taskList.printTaskList();
//                    break;
//            }
//

