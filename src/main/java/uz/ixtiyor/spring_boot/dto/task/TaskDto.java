package uz.ixtiyor.spring_boot.dto.task;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.ixtiyor.spring_boot.dto.GenericDto;

import java.time.Instant;

@Getter
@Setter
public class TaskDto extends GenericDto {
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
    private Instant updatedat;
    private Long updateby;

    @Builder(builderMethodName = "childBuilder")
    public TaskDto(Long id, String name, String description, String level, Instant deadline, String priority, Long parent_id, boolean completed, Long project_id, Long column_id, Instant createdat, Long createby, Instant updatedat, Long updateby) {
        super(id);
        this.name = name;
        this.description = description;
        this.level = level;
        this.deadline = deadline;
        this.priority = priority;
        this.parent_id = parent_id;
        this.completed = completed;
        this.project_id = project_id;
        this.column_id = column_id;
        this.createdat = createdat;
        this.createby = createby;
        this.updatedat = updatedat;
        this.updateby = updateby;
    }
}
