package com.projetobackend.repositories;

import com.projetobackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long > {
}
