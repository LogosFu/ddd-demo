package com.ddd.demo.order.domain;

import com.ddd.demo.order.controller.dto.OrderItemDto;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import lombok.Data;

@Data
public class Order {

  private Integer id;
  private Integer userId;
  private BigDecimal freight;
  private List<OrderItem> orderItems;

  public void create(List<OrderItem> items) {
    orderItems.addAll(items);
  }

  public BigDecimal countAmount() {
    return BigDecimal.ZERO;
  }
}
