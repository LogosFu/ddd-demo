package com.ddd.demo.order.instructure;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemJPARepository extends JpaRepository<OrderItemPo, Integer> {

}
