package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.enties.Shape;

public interface ShapeRepository extends JpaRepository<Shape, Long>  {

}
