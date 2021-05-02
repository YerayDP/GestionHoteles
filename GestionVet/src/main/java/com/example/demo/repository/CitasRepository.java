package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Citas;

public interface CitasRepository extends JpaRepository<Citas, Integer> {

}
