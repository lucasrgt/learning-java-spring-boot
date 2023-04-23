package com.lucas.learnspringframework.repositories;

import com.lucas.learnspringframework.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
