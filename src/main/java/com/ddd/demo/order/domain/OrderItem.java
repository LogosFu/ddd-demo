package com.ddd.demo.order.domain;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OrderItem {

  private BigDecimal price;
  private Integer count;
  private Integer goodsId;

  public BigDecimal getAmount() {
    return null;
  }
}
