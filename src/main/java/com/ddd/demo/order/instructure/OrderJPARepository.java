package com.ddd.demo.order.instructure;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJPARepository extends JpaRepository<OrderPo, Integer> {

}
