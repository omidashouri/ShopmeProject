package ir.omidashouri.common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
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


    public RoleEntity(Integer id) {
        this.id = id;
    }

    public RoleEntity(String name) {
        this.name = name;
    }

    public RoleEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
