package com.todocode.tpbazar.repository;

import com.todocode.tpbazar.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente,Long> {
}
