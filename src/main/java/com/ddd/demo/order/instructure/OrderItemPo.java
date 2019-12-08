package com.ddd.demo.order.instructure;

import com.ddd.demo.order.domain.OrderItem;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItemPo {

  @Id
  private Integer id;
  private BigDecimal price;
  private Integer goodsId;
  private Integer orderId;
  private Integer count;

  public OrderItemPo(OrderItem orderItem, Integer orderId) {

    this.price = orderItem.getPrice();
    this.goodsId = orderItem.getGoodsId();
    this.orderId = orderId;
    this.count = orderItem.getCount();
  }
}
