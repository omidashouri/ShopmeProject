package ir.omidashouri.admin.service;

import ir.omidashouri.admin.repository.RoleRepository;
import ir.omidashouri.admin.repository.UserRepository;
import ir.omidashouri.common.entity.RoleEntity;
import ir.omidashouri.common.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

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
        return userRepository.save(user);
    }
}
