package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Citas;

public interface CitasRepository extends JpaRepository<Citas, Integer> {

}
