package ir.omidashouri.admin.service;

import ir.omidashouri.common.entity.RoleEntity;
import ir.omidashouri.common.entity.UserEntity;

import java.util.List;


public interface UserService {

    List<UserEntity> listAll();

    List<RoleEntity> listRoles();

    UserEntity save(UserEntity user);
}
