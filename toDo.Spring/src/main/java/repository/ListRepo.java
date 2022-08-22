package repository;

import entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ListRepo extends CrudRepository <TaskEntity, Integer> { //1 парамет-сущность, с кот он будет работать, а второй-тип его идентификатора
Optional<TaskEntity> findById (Integer id);
}
