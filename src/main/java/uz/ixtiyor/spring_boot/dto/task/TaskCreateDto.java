package uz.ixtiyor.spring_boot.dto.task;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.ixtiyor.spring_boot.dto.Dto;

import java.time.Instant;

@Getter
@Setter
@Builder
public class TaskCreateDto implements Dto {
    private String name;
    private String description;
    private String level;
    private Instant deadline;
    private String priority;
    private Long parent_id;
    private boolean completed;
    private Long project_id;
    private Long column_id;
    private Instant createdat;
    private Long createby;

    public TaskCreateDto(String name, String description, String level, Instant deadline, String priority, Long parent_id, boolean completed, Long project, Long column, Instant createdat, Long createby) {
        this.name = name;
        this.description = description;
        this.level = level;
        this.deadline = deadline;
        this.priority = priority;
        this.parent_id = parent_id;
        this.completed = completed;
        this.project_id = project;
        this.column_id = column;
        this.createdat = createdat;
        this.createby = createby;
    }
}
