package com.conradoproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conradoproject.course.entities.*;
import com.conradoproject.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository <OrderItem, OrderItemPK>{

    
} 
