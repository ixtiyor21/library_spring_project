package uz.ixtiyor.spring_boot.services.column;

import uz.ixtiyor.spring_boot.criteria.GenericCriteria;
import uz.ixtiyor.spring_boot.dto.column.ColumnCreateDto;
import uz.ixtiyor.spring_boot.dto.column.ColumnDto;
import uz.ixtiyor.spring_boot.dto.column.ColumnUpdateDto;
import uz.ixtiyor.spring_boot.entity.column.Column;
import uz.ixtiyor.spring_boot.services.GenericCrudService;

public interface ColumnService  extends GenericCrudService<
        Column,
        ColumnDto,
        ColumnCreateDto,
        ColumnUpdateDto,
        GenericCriteria,
        Long> {
}
