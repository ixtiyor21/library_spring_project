package uz.ixtiyor.spring_boot.entity.column;

import lombok.Getter;
import lombok.Setter;
import uz.ixtiyor.spring_boot.entity.Auditable;
import uz.ixtiyor.spring_boot.entity.project.Project;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
public class Column extends Auditable {

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    private Integer order;

    private String icon;

    private boolean is_active;

    @Convert(disableConversion = true)
    @javax.persistence.Column(name = "createdat")
    private Instant createdat;

    @javax.persistence.Column(name = "createby", nullable = false)
    private Long createby;

    @Convert(disableConversion = true)
    @javax.persistence.Column(name = "updatedat")
    private Instant updatedat;

    @javax.persistence.Column(name = "updateby")
    private Long updateby;
}
