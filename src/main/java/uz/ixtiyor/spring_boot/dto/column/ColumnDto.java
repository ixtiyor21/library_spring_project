package uz.ixtiyor.spring_boot.dto.column;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.ixtiyor.spring_boot.dto.GenericDto;


@Getter
@Setter
public class ColumnDto extends GenericDto {
    private String name;
    private String icon;
    private String order;
    private boolean is_active;

    @Builder(builderMethodName = "childBuilder")
    public ColumnDto(Long id, String name, String icon, String order, boolean is_active) {
        super(id);
        this.name = name;
        this.icon = icon;
        this.order = order;
        this.is_active = is_active;
    }
}
