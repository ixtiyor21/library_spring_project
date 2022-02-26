package uz.ixtiyor.spring_boot.services.project;

import uz.ixtiyor.spring_boot.criteria.GenericCriteria;
import uz.ixtiyor.spring_boot.dto.project.ProjectCreateDto;
import uz.ixtiyor.spring_boot.dto.project.ProjectDto;
import uz.ixtiyor.spring_boot.dto.project.ProjectUpdateDto;
import uz.ixtiyor.spring_boot.entity.project.Project;
import uz.ixtiyor.spring_boot.services.GenericCrudService;

public interface ProjectService extends GenericCrudService<
        Project,
        ProjectDto,
        ProjectCreateDto,
        ProjectUpdateDto,
        GenericCriteria,
        Long
        > {
}
