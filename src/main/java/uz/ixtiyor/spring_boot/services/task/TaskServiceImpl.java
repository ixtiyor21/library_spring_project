package uz.ixtiyor.spring_boot.services.task;


import org.springframework.stereotype.Service;
import uz.ixtiyor.spring_boot.criteria.GenericCriteria;
import uz.ixtiyor.spring_boot.dto.task.TaskCreateDto;
import uz.ixtiyor.spring_boot.dto.task.TaskDto;
import uz.ixtiyor.spring_boot.dto.task.TaskUpdateDto;
import uz.ixtiyor.spring_boot.entity.task.Task;
import uz.ixtiyor.spring_boot.mapper.TaskMapper;
import uz.ixtiyor.spring_boot.reposiroty.TaskRepository;
import uz.ixtiyor.spring_boot.services.AbstractService;
import uz.ixtiyor.spring_boot.utils.BaseUtils;
import uz.ixtiyor.spring_boot.utils.validators.task.TaskValidator;

import java.util.List;

@Service
public class TaskServiceImpl extends AbstractService<
        TaskRepository,
        TaskMapper,
        TaskValidator>
        implements TaskService {
    protected TaskServiceImpl(TaskRepository repository, TaskMapper mapper, TaskValidator validator, BaseUtils baseUtils) {
        super(repository, mapper, validator, baseUtils);
    }

    @Override
    public Long create(TaskCreateDto createDto) {
        Task task = mapper.fromCreateDto(createDto);
        return task.getId();
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public Void update(TaskUpdateDto updateDto) {
        return null;
    }

    @Override
    public List<TaskDto> getAll(GenericCriteria criteria) {
        return null;
    }

    @Override
    public TaskDto get(Long id) {
        return null;
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}
