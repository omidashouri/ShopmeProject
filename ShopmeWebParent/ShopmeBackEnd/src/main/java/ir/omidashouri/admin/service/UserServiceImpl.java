package ir.omidashouri.admin.service;

import ir.omidashouri.admin.repository.RoleRepository;
import ir.omidashouri.admin.repository.UserRepository;
import ir.omidashouri.common.entity.RoleEntity;
import ir.omidashouri.common.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public List<UserEntity> listAll() {
        return (List<UserEntity>) userRepository.findAll();
    }

    @Override
    public List<RoleEntity> listRoles() {
        return (List<RoleEntity>) roleRepository.findAll();
    }

    @Override
    public UserEntity save(UserEntity user) {
        encodePassword(user);
        return userRepository.save(user);
    }

    @Override
    public boolean isEmailUnique(String email) {
        UserEntity userByEmail = userRepository.getUserEntityByEmail(email);
        return Objects.isNull(userByEmail);
    }

    private void encodePassword(UserEntity user){
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

    }
}
