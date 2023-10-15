package ru.kata.spring.boot_security.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;


public interface RoleDao {

    List<Role> getAllRoles ();

    Role getRole (String userRole);

    Role getRoleById (Long id);

    void addRole (Role role);
}
