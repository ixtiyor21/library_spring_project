package uz.ixtiyor.spring_boot.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.ixtiyor.spring_boot.dto.project.ProjectCreateDto;
import uz.ixtiyor.spring_boot.dto.project.ProjectDto;
import uz.ixtiyor.spring_boot.dto.project.ProjectUpdateDto;
import uz.ixtiyor.spring_boot.entity.project.Project;


@Component
@Mapper(componentModel = "spring")
public interface ProjectMapper extends BaseMapper<
        Project,
        ProjectDto,
        ProjectCreateDto,
        ProjectUpdateDto> {
}
