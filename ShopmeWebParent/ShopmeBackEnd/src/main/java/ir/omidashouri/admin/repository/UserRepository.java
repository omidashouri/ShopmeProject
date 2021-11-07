package ir.omidashouri.admin.repository;

import ir.omidashouri.common.entity.UserEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

    @Query("select u from UserEntity u where u.email = :email")
    public UserEntity getUserEntityByEmail(@Param("email") String email);

    UserEntity findUserEntityById(@Param("id") Integer id);

    Long countById(Integer id);

    @Query("UPDATE UserEntity u set u.enabled = :userEnabled where u.id = :userId")
    @Modifying
    void updateEnableStatus(@Param("userId") Integer id,@Param("userEnabled") boolean enabled);
}
