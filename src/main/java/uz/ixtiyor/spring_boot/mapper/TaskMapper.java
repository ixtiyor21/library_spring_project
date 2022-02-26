package uz.ixtiyor.spring_boot.mapper;


import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.ixtiyor.spring_boot.dto.task.TaskCreateDto;
import uz.ixtiyor.spring_boot.dto.task.TaskDto;
import uz.ixtiyor.spring_boot.dto.task.TaskUpdateDto;
import uz.ixtiyor.spring_boot.entity.task.Task;

@Component
@Mapper(componentModel = "spring")
public interface TaskMapper extends BaseMapper<
        Task,
        TaskDto,
        TaskCreateDto,
        TaskUpdateDto> {

}
