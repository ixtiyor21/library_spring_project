package uz.ixtiyor.spring_boot.services.task;

import uz.ixtiyor.spring_boot.criteria.GenericCriteria;
import uz.ixtiyor.spring_boot.dto.task.TaskCreateDto;
import uz.ixtiyor.spring_boot.dto.task.TaskDto;
import uz.ixtiyor.spring_boot.dto.task.TaskUpdateDto;
import uz.ixtiyor.spring_boot.entity.task.Task;
import uz.ixtiyor.spring_boot.services.GenericCrudService;



public interface TaskService extends GenericCrudService<
        Task,
        TaskDto,
        TaskCreateDto,
        TaskUpdateDto,
        GenericCriteria,
        Long > {
}
