package sn.app.AppRole.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.app.AppRole.entities.AppRoleEntity;

public interface AppRoleRepository extends JpaRepository<AppRoleEntity,Integer> {
    AppRoleEntity findById(int Id);
    AppRoleEntity findByEmailAndPassword(String email, String password);
}
