package ir.omidashouri.admin.repository;

import ir.omidashouri.common.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<UserEntity,Integer> {

    @Query("select u from UserEntity u where u.email = :email")
    public UserEntity getUserEntityByEmail(@Param("email") String email);

}
