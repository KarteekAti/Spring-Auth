package com.springauth.SpringAuth.repository;

import com.springauth.SpringAuth.model.Role.ERole;
import com.springauth.SpringAuth.model.Role.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends MongoRepository<Role,String> {
    Optional<Role> findByName(ERole role);
}
