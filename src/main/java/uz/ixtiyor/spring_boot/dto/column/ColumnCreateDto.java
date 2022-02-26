package uz.ixtiyor.spring_boot.dto.column;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.ixtiyor.spring_boot.dto.Dto;

import java.time.Instant;

@Getter
@Setter
@Builder
public class ColumnCreateDto implements Dto {
    private String name;
    private String icon;
    private String order;
    private boolean is_active;

    private Instant createdat;
    private Long createby;

    public ColumnCreateDto(String name, String icon, String order, boolean is_active, Instant createdat, Long createby) {
        this.name = name;
        this.icon = icon;
        this.order = order;
        this.is_active = is_active;
        this.createdat = createdat;
        this.createby = createby;
    }

}
