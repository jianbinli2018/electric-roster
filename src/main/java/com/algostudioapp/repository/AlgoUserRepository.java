package com.algostudioapp.repository;

import com.algostudioapp.model.AlgoUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AlgoUserRepository extends CrudRepository<AlgoUser, UUID> {
    Optional<AlgoUser> findByUsername(String username);
}
