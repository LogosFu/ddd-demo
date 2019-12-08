package com.ddd.demo.domain;

import java.math.BigDecimal;
import java.util.List;

public class Order {

  private Integer id;
  private Integer userId;
  private BigDecimal freight;
  private List<OrderItem> orderItems;
}
