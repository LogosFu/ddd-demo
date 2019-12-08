package com.ddd.demo.order.instructure;

import com.ddd.demo.order.domain.Order;
import com.ddd.demo.order.domain.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class OrderRepositoryImpl implements OrderRepository {

  private final OrderRepository orderRepository;

  @Override
  public void save(Order order) {

  }
}
