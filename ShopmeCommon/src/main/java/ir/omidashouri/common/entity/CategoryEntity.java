package ir.omidashouri.common.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "tbl_categories",schema = "shopme_sc")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, length = 128, unique = true)
    private String name;

    @Column(name = "alias", nullable = false, length = 64, unique = true)
    private String alias;

    @Column(name = "image", nullable = false, length = 128)
    private String image;

    @Column(name = "enabled")
    private boolean enabled;

    @OneToOne //default eager
    @JoinColumn(name = "parent_id")
    private CategoryEntity parent;

    @OneToMany(mappedBy = "parent") //default lazy
    private Set<CategoryEntity> children = new HashSet<>();

    @Transient
    private boolean hasChildren;

    @Transient
    public String getImagePath() {
        if (id == null) {
            return "/images/image-thumbnail.png";
        }
        return "/category-images/" + id + "/" + this.image;
    }

}
