package com.ruveyda.repository;

import com.ruveyda.entity.Customer;
import com.ruveyda.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
