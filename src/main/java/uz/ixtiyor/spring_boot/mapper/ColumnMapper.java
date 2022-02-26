package uz.ixtiyor.spring_boot.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.ixtiyor.spring_boot.dto.column.ColumnCreateDto;
import uz.ixtiyor.spring_boot.dto.column.ColumnDto;
import uz.ixtiyor.spring_boot.dto.column.ColumnUpdateDto;
import uz.ixtiyor.spring_boot.entity.column.Column;



@Component
@Mapper(componentModel = "spring")
public interface ColumnMapper extends BaseMapper<
        Column,
        ColumnDto,
        ColumnCreateDto,
        ColumnUpdateDto> {
}
