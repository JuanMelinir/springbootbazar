package com.todocode.tpbazar.repository;

import com.todocode.tpbazar.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaRepository extends JpaRepository<Venta,Long> {

}
