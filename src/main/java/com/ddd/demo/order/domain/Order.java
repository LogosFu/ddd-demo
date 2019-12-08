package com.ddd.demo.order.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {

  private Integer id;
  private Integer userId;
  private BigDecimal freight;
  private List<OrderItem> orderItems = new ArrayList<>();

  public BigDecimal countAmount() {
    return BigDecimal.ZERO;
  }

  public Order create(Order order){
  }
}
