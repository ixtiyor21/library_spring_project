package uz.ixtiyor.spring_boot.entity.organization;

import lombok.Getter;
import lombok.Setter;
import uz.ixtiyor.spring_boot.entity.Auditable;

import javax.persistence.*;


@Getter
@Setter
@Entity
public class Organization extends Auditable {

    @Column(nullable = false, length = 100)
    private String name;

    private String logo;

    private String email;

    @Column(unique = true, nullable = false)
    private String code;

    private String location;

    private Long owner;
}
