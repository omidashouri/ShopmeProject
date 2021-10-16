package ir.omidashouri.admin.repository.user;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderTest {

    @Test
    public void testEncoderPassword(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String rawPassword = "12345678";
        String encodedPassword = bCryptPasswordEncoder.encode(rawPassword);

        System.out.println(encodedPassword);

        boolean matches = bCryptPasswordEncoder.matches(rawPassword,encodedPassword);
        Assertions.assertThat(matches).isEqualTo(true);
    }
}
