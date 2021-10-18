package ir.omidashouri.admin.service;

import ir.omidashouri.admin.exception.UserNotFoundException;
import ir.omidashouri.common.entity.RoleEntity;
import ir.omidashouri.common.entity.UserEntity;

import java.util.List;


public interface UserService {

    List<UserEntity> listAll();

    List<RoleEntity> listRoles();

    UserEntity findById(Integer id) throws UserNotFoundException;

    UserEntity save(UserEntity user);

    boolean isEmailUnique(Integer id, String email);
}
