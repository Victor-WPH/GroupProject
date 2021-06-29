package com.Entity.JPA;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderDetailRepository extends CrudRepository<OrderDetail, Integer> {
    List<OrderDetail> findByOrderId(String s);
}
