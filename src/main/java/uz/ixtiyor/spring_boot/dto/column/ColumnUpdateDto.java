package uz.ixtiyor.spring_boot.dto.column;

import lombok.Getter;
import lombok.Setter;
import uz.ixtiyor.spring_boot.dto.GenericDto;
import uz.ixtiyor.spring_boot.entity.project.Project;

import java.time.Instant;


@Getter
@Setter
public class ColumnUpdateDto extends GenericDto {
    private String name;
    private Project project;
    private Integer order;
    private String icon;

    private Instant updatedat;
    private Long updateby;

    public ColumnUpdateDto(Long id, String name, Project project, Integer order, String icon, Instant updatedat, Long updateby) {
        super(id);
        this.name = name;
        this.project = project;
        this.order = order;
        this.icon = icon;
        this.updatedat = updatedat;
        this.updateby = updateby;
    }
}
