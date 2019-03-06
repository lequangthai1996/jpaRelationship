package com.example.demo.manytomany;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Override
    Optional<UserEntity> findById(Long aLong);
}
