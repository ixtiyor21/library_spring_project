package uz.ixtiyor.spring_boot.utils.validators.task;

import org.springframework.stereotype.Component;
import uz.ixtiyor.spring_boot.dto.task.TaskCreateDto;
import uz.ixtiyor.spring_boot.dto.task.TaskUpdateDto;
import uz.ixtiyor.spring_boot.exceptions.ValidationException;
import uz.ixtiyor.spring_boot.utils.BaseUtils;
import uz.ixtiyor.spring_boot.utils.validators.AbstractValidator;


@Component
public class TaskValidator  extends AbstractValidator<TaskCreateDto, TaskUpdateDto, Long> {
    protected TaskValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(TaskCreateDto taskCreateDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(TaskUpdateDto cd) throws ValidationException {

    }
}
