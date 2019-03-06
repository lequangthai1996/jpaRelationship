package com.example.demo.manytomany;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserNetworkRepository extends JpaRepository<UserNetworkEntity, Long> {
    @Override
    Optional<UserNetworkEntity> findById(Long aLong);
}
