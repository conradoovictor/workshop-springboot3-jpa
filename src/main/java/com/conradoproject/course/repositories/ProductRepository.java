package com.conradoproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conradoproject.course.entities.*;

public interface ProductRepository extends JpaRepository <Product, Long>{

    
} 
