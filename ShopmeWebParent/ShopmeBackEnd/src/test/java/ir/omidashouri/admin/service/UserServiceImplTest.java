package ir.omidashouri.admin.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserServiceImplTest {


    @Autowired
    UserService userService;

    @Test
    void isEmailUnique() {
        boolean result = userService.isEmailUnique(1, "omidashouri@gmail.com");
        assertThat(result).isFalse();
    }
}