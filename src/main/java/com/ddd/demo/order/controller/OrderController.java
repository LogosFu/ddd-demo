package com.ddd.demo.order.controller;

import com.ddd.demo.order.applicationservice.BuyService;
import com.ddd.demo.order.controller.dto.OrderCreateDto;
import com.ddd.demo.order.controller.dto.OrderDto;
import com.ddd.demo.order.domain.Order;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/order")
public class OrderController {

  private final BuyService buyService;

  @PostMapping("/add")
  public OrderDto createOrderCommand(@RequestBody OrderCreateDto orderCreateDto) {

    Order order = buyService.createOrderCommand(orderCreateDto.toOrderItems());

    return new OrderDto(order);
  }
}
