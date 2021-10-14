package ir.omidashouri.admin.repositories.user;


import ir.omidashouri.common.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity,Integer> {
}
