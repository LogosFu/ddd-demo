package com.ddd.demo.order.domain;

import com.ddd.demo.order.controller.dto.OrderItemDto;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Order {

  private Integer id;
  private Integer userId;
  private BigDecimal freight;
  private List<OrderItem> orderItems;

  public Order create(List<OrderItemDto> items) {

    return this;
  }
}
