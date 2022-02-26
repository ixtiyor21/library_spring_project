package uz.ixtiyor.spring_boot.utils.validators.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uz.ixtiyor.spring_boot.dto.project.ProjectCreateDto;
import uz.ixtiyor.spring_boot.dto.project.ProjectUpdateDto;
import uz.ixtiyor.spring_boot.exceptions.ValidationException;
import uz.ixtiyor.spring_boot.utils.BaseUtils;
import uz.ixtiyor.spring_boot.utils.validators.AbstractValidator;


@Component
public class ProjectValidator extends AbstractValidator<ProjectCreateDto, ProjectUpdateDto, Long> {

    @Autowired
    protected ProjectValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(ProjectCreateDto projectCreateDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(ProjectUpdateDto cd) throws ValidationException {

    }
}
