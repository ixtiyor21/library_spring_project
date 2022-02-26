package uz.ixtiyor.spring_boot.entity.task;

import lombok.Getter;
import lombok.Setter;
import uz.ixtiyor.spring_boot.entity.Auditable;
import uz.ixtiyor.spring_boot.entity.column.Column;
import uz.ixtiyor.spring_boot.entity.project.Project;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
public class Task extends Auditable {

    private String name;
    private String description;

    private String level;

    @Convert(disableConversion = true)
    @javax.persistence.Column(name = "deadline")
    private Instant deadline;

    private String priority;
    private Long parent_id;
    private boolean completed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "column_id")
    private Column column;

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

    public Task(Long id, String name, String description, String level, Instant deadline, String priority, Long parent_id, boolean completed, Project project, Column column, Instant createdat, Long createby) {
        super(id);
        this.name = name;
        this.description = description;
        this.level = level;
        this.deadline = deadline;
        this.priority = priority;
        this.parent_id = parent_id;
        this.completed = completed;
        this.project = project;
        this.column = column;
        this.createdat = createdat;
        this.createby = createby;
    }
}
