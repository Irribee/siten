package service;

import entity.TaskEntity;
import entity.ToDoEntity;
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

    public ToDoEntity createTodo(ToDoEntity todo, Integer userId) {
        TaskEntity task = ListRepo.findById(userId).get();
        todo.setTask(task);
        return todoRepo.save(todo);
    }

    public ToDoEntity complete(Integer id) {
        ToDoEntity todo = todoRepo.findById(id).get();
        todo.setStatus(!todo.getStatus());
        return todoRepo.save(todo);
    }
}
}
