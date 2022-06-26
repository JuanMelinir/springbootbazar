package com.todocode.bazar.repository;

import com.todocode.bazar.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<Producto,Long> {

}
