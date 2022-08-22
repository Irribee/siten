package service;

import entity.TaskEntity;
import exceptions.TaskAlreadyException;
import exceptions.TaskNoFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;
import repository.ListRepo;

@Service
public class TaskService {
    @Autowired //чтобы спринг внедрил объект этого класса, типа проинициализировал
    private ListRepo listRepo;

    public TaskEntity registration(TaskEntity taskEntity) throws TaskAlreadyException {
        if (listRepo.findById(taskEntity.getId()) != null) { //для получения сущности, но нужно искать по text
            throw new TaskAlreadyException("Taкая задача уже сущеествует");
        }
        return listRepo.save(taskEntity);  //чтобы сохранить объект
    }

    public TaskEntity getOne(Integer id) throws TaskNoFoundException {
        TaskEntity taskEntity = listRepo.findById(id).get();
        if (taskEntity == null) { //пробуем найти текст с таким то текстом с помощью репозитория
            throw new TaskNoFoundException("Задача не была найдена");
        }
        return taskEntity;
    }
    public Task delete (Integer id){
        listRepo.deleteById(id);
        return id;
    }
}
