package uz.ixtiyor.spring_boot.services.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.ixtiyor.spring_boot.criteria.GenericCriteria;
import uz.ixtiyor.spring_boot.dto.project.ProjectCreateDto;
import uz.ixtiyor.spring_boot.dto.project.ProjectDto;
import uz.ixtiyor.spring_boot.dto.project.ProjectUpdateDto;
import uz.ixtiyor.spring_boot.entity.project.Project;
import uz.ixtiyor.spring_boot.mapper.ProjectMapper;
import uz.ixtiyor.spring_boot.reposiroty.ProjectRepository;
import uz.ixtiyor.spring_boot.services.AbstractService;
import uz.ixtiyor.spring_boot.utils.BaseUtils;
import uz.ixtiyor.spring_boot.utils.validators.project.ProjectValidator;

import java.util.List;

@Service
public class ProjectServiceImpl extends AbstractService<ProjectRepository, ProjectMapper, ProjectValidator>
        implements ProjectService {


    @Autowired
    protected ProjectServiceImpl(ProjectRepository repository, ProjectMapper mapper, ProjectValidator validator, BaseUtils baseUtils) {
        super(repository, mapper, validator, baseUtils);
    }

    @Override
    public Long create(ProjectCreateDto createDto) {
        Project project = mapper.fromCreateDto(createDto);
        repository.save(project);
        return project.getId();
    }

    @Override
    public Void delete(Long id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public Void update(ProjectUpdateDto updateDto) {
        return null;
    }

    @Override
    public List<ProjectDto> getAll(GenericCriteria criteria) {
        return null;
    }

    @Override
    public ProjectDto get(Long id) {
        return null;
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}
