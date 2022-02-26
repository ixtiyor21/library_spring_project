package uz.ixtiyor.spring_boot.services.column;


import org.springframework.stereotype.Service;
import uz.ixtiyor.spring_boot.criteria.GenericCriteria;
import uz.ixtiyor.spring_boot.dto.column.ColumnCreateDto;
import uz.ixtiyor.spring_boot.dto.column.ColumnDto;
import uz.ixtiyor.spring_boot.dto.column.ColumnUpdateDto;
import uz.ixtiyor.spring_boot.entity.column.Column;
import uz.ixtiyor.spring_boot.mapper.ColumnMapper;
import uz.ixtiyor.spring_boot.reposiroty.ColumnRepository;
import uz.ixtiyor.spring_boot.services.AbstractService;
import uz.ixtiyor.spring_boot.utils.BaseUtils;
import uz.ixtiyor.spring_boot.utils.validators.column.ColumnValidator;

import java.util.List;

@Service
public class ColumnServiceImpl extends AbstractService<ColumnRepository, ColumnMapper, ColumnValidator> implements ColumnService{

    protected ColumnServiceImpl(ColumnRepository repository, ColumnMapper mapper, ColumnValidator validator, BaseUtils baseUtils) {
        super(repository, mapper, validator, baseUtils);
    }

    @Override
    public Long create(ColumnCreateDto createDto) {
        Column column = mapper.fromCreateDto(createDto);
        repository.save(column);
        return column.getId();
    }

    @Override
    public Void delete(Long id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public Void update(ColumnUpdateDto updateDto) {
        return null;
    }

    @Override
    public List<ColumnDto> getAll(GenericCriteria criteria) {
        return null;
    }

    @Override
    public ColumnDto get(Long id) {
        return null;
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}
