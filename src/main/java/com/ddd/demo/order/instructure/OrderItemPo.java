package com.ddd.demo.order.instructure;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_item")
public class OrderItemPo {

  @Id
  private Integer id;
  private BigDecimal price;
  @ManyToOne
  @JoinColumn(name = "order_id")
  @JoinTable(name = "order")
  private OrderPo order;
}
