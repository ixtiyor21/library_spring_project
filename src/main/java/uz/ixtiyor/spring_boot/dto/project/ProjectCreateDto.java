package uz.ixtiyor.spring_boot.dto.project;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.ixtiyor.spring_boot.dto.Dto;
import uz.ixtiyor.spring_boot.entity.organization.Organization;

import java.time.Instant;

@Getter
@Setter
@Builder
public class ProjectCreateDto implements Dto {
    private String name;
    private String tzPath;
    private Organization organization;
    private String email;
    private Boolean closed;
    private Instant createdat;
    private Long createby;

    public ProjectCreateDto(String name, String tzPath, Organization organization, String email, Boolean closed, Instant createdat, Long createby) {
        this.name = name;
        this.tzPath = tzPath;
        this.organization = organization;
        this.email = email;
        this.closed = closed;
        this.createdat = createdat;
        this.createby = createby;
    }
}
