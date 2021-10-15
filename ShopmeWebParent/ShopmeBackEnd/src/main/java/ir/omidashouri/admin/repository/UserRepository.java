package ir.omidashouri.admin.repository;

import ir.omidashouri.common.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Integer> {

}
