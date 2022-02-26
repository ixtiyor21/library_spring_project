package uz.ixtiyor.spring_boot.dto.task;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.ixtiyor.spring_boot.dto.GenericDto;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
public class TaskUpdateDto extends GenericDto {
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
}
