package com.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
