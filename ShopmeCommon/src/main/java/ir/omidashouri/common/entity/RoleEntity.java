package ir.omidashouri.common.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tbl_roles",schema = "shopme_sc")
public class RoleEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, length = 40, unique = true)
    private String name;

    @Column(name = "description", nullable = false, length = 150)
    private String description;
}
