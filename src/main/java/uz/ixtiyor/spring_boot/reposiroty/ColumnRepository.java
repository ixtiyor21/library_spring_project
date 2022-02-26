package uz.ixtiyor.spring_boot.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.ixtiyor.spring_boot.entity.column.Column;

public interface ColumnRepository extends JpaRepository<Column, Long>, AbstractRepository{
}
