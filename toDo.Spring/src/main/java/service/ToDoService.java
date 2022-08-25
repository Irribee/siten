package service;

import entity.TaskEntity;
import entity.ToDoEntity;
import model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ListRepo;
import repository.ToDoRepo;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepo todoRepo;
    @Autowired
    private ListRepo listRepo;

    public ToDo createTodo(ToDoEntity todo, Integer userId) {
        TaskEntity task = ListRepo.findById(userId).get();
        todo.setTask(task);
        return ToDo.toModel(todoRepo.save(todo));
    }

    public ToDo complete(Integer id) {
        ToDoEntity todo = todoRepo.findById(id).get();
        todo.setStatus(todo.getStatus());
        return ToDo.toModel(todoRepo.save(todo));
    }
}

