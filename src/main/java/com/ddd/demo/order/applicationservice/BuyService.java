package com.ddd.demo.order.applicationservice;

import com.ddd.demo.order.controller.dto.OrderCreateDto;
import com.ddd.demo.order.controller.dto.OrderDto;
import com.ddd.demo.order.domain.Order;
import com.ddd.demo.order.domain.OrderItem;
import com.ddd.demo.order.domain.OrderRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BuyService {

  private final OrderRepository orderRepository;

  public Order createOrderCommand(List<OrderItem> orderItems) {
    Order order = new Order();
    order.create(orderItems);
    orderRepository.save(order);

    return order;
  }
}
