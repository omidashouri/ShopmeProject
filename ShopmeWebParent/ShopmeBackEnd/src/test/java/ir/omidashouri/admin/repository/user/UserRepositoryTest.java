package ir.omidashouri.admin.repository.user;

import ir.omidashouri.admin.repository.UserRepository;
import ir.omidashouri.common.entity.RoleEntity;
import ir.omidashouri.common.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) //run test in real database not h2 database
@Rollback(value = true)
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    TestEntityManager testEntityManager;

    @Test
    public void testCreateUser() {
        RoleEntity role = testEntityManager.find(RoleEntity.class,1);
        UserEntity user = new UserEntity("omidashouri@gmail.com","123","Omid","Ashouri");
        user.addRole(role);
        userRepository.save(user);

        assertThat(userRepository.findAll().spliterator().getExactSizeIfKnown()).isGreaterThan(0);
    }

    @Test
    public void testCreateUserWithTwoRole() {
        UserEntity user = new UserEntity("omidashouri1@gmail.com","123","Omid1","Ashouri1");

        RoleEntity roleEditor = new RoleEntity(3);
        RoleEntity roleAssistant = new RoleEntity(5);
        user.addRole(roleEditor);
        user.addRole(roleAssistant);

        UserEntity savedUser = userRepository.save(user);

        assertThat(savedUser.getId()).isGreaterThan(0);
    }

    @Test
    public void testGetUserById() {
        UserEntity findUser = userRepository.findById(1).get();
        assertThat(findUser).isNotNull();
    }

    @Test
    public void testUpdateUserStatus() {
        UserEntity findUser = userRepository.findById(1).get();
        findUser.setEnabled(true);
        UserEntity savedUser = userRepository.save(findUser);
        assertThat(savedUser.isEnabled()).isTrue();
    }

}