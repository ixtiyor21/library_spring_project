package uz.ixtiyor.spring_boot.dto.project;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.ixtiyor.spring_boot.dto.GenericDto;
import uz.ixtiyor.spring_boot.entity.organization.Organization;

@Getter
@Setter
public class ProjectDto extends GenericDto {

    private String name;
    private String tzPath;
    private Organization organization;
    private String email;
    private Boolean closed;


    @Builder(builderMethodName = "childBuilder")
    public ProjectDto(Long id, String name, String tzPath, Organization organization, String email, Boolean closed) {
        super(id);
        this.name = name;
        this.tzPath = tzPath;
        this.organization = organization;
        this.email = email;
        this.closed = closed;
    }
}