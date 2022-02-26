package uz.ixtiyor.spring_boot.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.ixtiyor.spring_boot.entity.project.Project;

public interface TaskRepository extends JpaRepository<Project, Long>, AbstractRepository{
}
