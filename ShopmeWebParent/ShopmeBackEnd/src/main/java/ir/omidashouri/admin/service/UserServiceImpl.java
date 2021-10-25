package ir.omidashouri.admin.service;

import ir.omidashouri.admin.exception.UserNotFoundException;
import ir.omidashouri.admin.repository.RoleRepository;
import ir.omidashouri.admin.repository.UserRepository;
import ir.omidashouri.common.entity.RoleEntity;
import ir.omidashouri.common.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

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
    public UserEntity findById(Integer id) throws UserNotFoundException {

        UserEntity user = userRepository.findUserEntityById(id);
        if (user == null) {
            throw new UserNotFoundException("could not find user with ID " + id);
        }
        return user;
    }

    @Override
    public UserEntity save(UserEntity user) {
        boolean isUpdatingUser = (user.getId() != null);

        if (isUpdatingUser) {
            UserEntity existingUser = userRepository.findUserEntityById(user.getId());
            if (user.getPassword().isEmpty()) {
                user.setPassword(existingUser.getPassword());
            } else {
                encodePassword(user);
            }
        } else {
            encodePassword(user);
        }
        return userRepository.save(user);
    }

    @Override
    public boolean isEmailUnique(Integer id, String email) {
        UserEntity userByEmail = userRepository.getUserEntityByEmail(email);

        if (userByEmail == null)
            return true;

        boolean isCreatingNew = (id == null);

        if (isCreatingNew) {
            if (userByEmail != null) return false;
        } else {
            if (userByEmail.getId() != id) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void delete(Integer id) throws UserNotFoundException {
        Long countById = userRepository.countById(id);
        if (countById == null || countById == 0) {
            throw new UserNotFoundException("could not find user with ID " + id);
        }
        userRepository.deleteById(id);
    }

    private void encodePassword(UserEntity user) {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

    }
}
