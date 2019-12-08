package com.ddd.demo.order.controller.dto;

import com.ddd.demo.order.domain.Order;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

  private Integer id;
  private BigDecimal amount;

  public OrderDto(Order order) {
    this.id = order.getId();
    this.amount = order.countAmount();
  }
}
