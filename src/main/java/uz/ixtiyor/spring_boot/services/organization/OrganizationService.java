package uz.ixtiyor.spring_boot.services.organization;

import uz.ixtiyor.spring_boot.criteria.GenericCriteria;
import uz.ixtiyor.spring_boot.dto.organization.OrganizationCreateDto;
import uz.ixtiyor.spring_boot.dto.organization.OrganizationDto;
import uz.ixtiyor.spring_boot.dto.organization.OrganizationUpdateDto;
import uz.ixtiyor.spring_boot.entity.organization.Organization;
import uz.ixtiyor.spring_boot.services.GenericCrudService;

public interface OrganizationService extends GenericCrudService<
        Organization,
        OrganizationDto,
        OrganizationCreateDto,
        OrganizationUpdateDto,
        GenericCriteria,
        Long> {

}
