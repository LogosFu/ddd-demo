package com.ddd.demo.order.controller.dto;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderItemDto {

  private Integer count;
  private BigDecimal price;
}
