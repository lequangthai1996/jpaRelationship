package com.example.demo.manytomany;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NetworkRepository extends JpaRepository<NetworkEntity, Long> {
    @Override
    Optional<NetworkEntity> findById(Long aLong);
}
