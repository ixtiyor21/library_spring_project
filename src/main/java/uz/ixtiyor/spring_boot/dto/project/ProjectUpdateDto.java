package uz.ixtiyor.spring_boot.dto.project;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.ixtiyor.spring_boot.dto.GenericDto;
import uz.ixtiyor.spring_boot.entity.organization.Organization;


@Getter
@Setter
@NoArgsConstructor
public class ProjectUpdateDto extends GenericDto {
    private String name;
    private String tzPath;
    private Organization organization;
    private String email;
    private Boolean closed;
}
