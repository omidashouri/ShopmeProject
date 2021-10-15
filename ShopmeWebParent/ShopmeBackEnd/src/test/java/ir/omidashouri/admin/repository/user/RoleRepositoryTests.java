package ir.omidashouri.admin.repository.user;

import ir.omidashouri.admin.repository.RoleRepository;
import ir.omidashouri.common.entity.RoleEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) //run test in real database not h2 database
@Rollback(value = true)
public class RoleRepositoryTests {

    @Autowired
    RoleRepository roleRepository;

    @Test
    public void createFirstRole(){
        RoleEntity role = new RoleEntity("Admin","omid admin");
        RoleEntity savedRole =  roleRepository.save(role);
        assertThat(savedRole.getId()).isGreaterThan(0);
    }

    @Test
    public void createRestApiRoles(){
        RoleEntity roleSalesPerson = new RoleEntity("Salesperson","manage product price, customers, shipping, orders and sales report");
        RoleEntity roleEditor = new RoleEntity("Editor","manage categories, brands, products, articles and menus");
        RoleEntity roleShipper = new RoleEntity("Shipper","view products, view orders and update order status");
        RoleEntity roleAssistant = new RoleEntity("Assistant","manage questions and reviews");
        Iterable<RoleEntity> savedRoles =  roleRepository.saveAll(List.of(roleSalesPerson, roleEditor, roleShipper, roleAssistant));
        assertThat(savedRoles.spliterator().getExactSizeIfKnown()).isEqualTo(4);
    }
}
