package uz.ixtiyor.spring_boot.services.organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.ixtiyor.spring_boot.criteria.GenericCriteria;
import uz.ixtiyor.spring_boot.dto.organization.OrganizationCreateDto;
import uz.ixtiyor.spring_boot.dto.organization.OrganizationDto;
import uz.ixtiyor.spring_boot.dto.organization.OrganizationUpdateDto;
import uz.ixtiyor.spring_boot.entity.organization.Organization;
import uz.ixtiyor.spring_boot.mapper.OrganizationMapper;
import uz.ixtiyor.spring_boot.reposiroty.OrganizationRepository;
import uz.ixtiyor.spring_boot.services.AbstractService;
import uz.ixtiyor.spring_boot.utils.BaseUtils;
import uz.ixtiyor.spring_boot.utils.validators.organization.OrganizationValidator;

import java.util.List;

@Service
public class OrganizationServiceImpl extends AbstractService<OrganizationRepository, OrganizationMapper, OrganizationValidator>
        implements OrganizationService {


    @Autowired
    protected OrganizationServiceImpl(OrganizationRepository repository, OrganizationMapper mapper, OrganizationValidator validator, BaseUtils baseUtils) {
        super(repository, mapper, validator, baseUtils);
    }

    @Override
    public Long create(OrganizationCreateDto createDto) {
        Organization organization = mapper.fromCreateDto(createDto);
        repository.save(organization);
        return organization.getId();
    }

    @Override
    public Void delete(Long id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public Void update(OrganizationUpdateDto updateDto) {
        Organization organization = mapper.fromUpdateDto(updateDto);
        repository.save(organization);
        return null;
    }

    @Override
    public List<OrganizationDto> getAll(GenericCriteria criteria) {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public OrganizationDto get(Long id) {
        Organization organization = repository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("Topilmadi");
        });
        return mapper.toDto(organization);
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}
