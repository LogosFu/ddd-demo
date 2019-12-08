package com.ddd.demo.order.applicationservice;

import com.ddd.demo.order.controller.dto.OrderCreateDto;
import com.ddd.demo.order.controller.dto.OrderDto;
import com.ddd.demo.order.domain.Order;
import com.ddd.demo.order.domain.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BuyService {

  private final OrderRepository orderRepository;

  public OrderDto createOrderCommand(OrderCreateDto orderCreateDto) {
    Order order = new Order();
    order.create(orderCreateDto.getItems());
    orderRepository.save(order);
    return new OrderDto();
  }
}
