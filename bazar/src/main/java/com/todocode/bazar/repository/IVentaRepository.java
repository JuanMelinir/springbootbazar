package com.todocode.bazar.repository;

import com.todocode.bazar.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVentaRepository extends JpaRepository<Venta,Long> {
}
