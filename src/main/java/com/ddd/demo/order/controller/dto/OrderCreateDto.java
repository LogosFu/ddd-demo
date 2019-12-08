package com.ddd.demo.order.controller.dto;

import com.ddd.demo.order.domain.Order;
import com.ddd.demo.order.domain.OrderItem;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreateDto {

  private Integer userId;
  private List<OrderItemDto> items;

  public Order createDomain() {
    Order order = new Order();
    order.setFreight(new BigDecimal(20));
    order.setOrderItems(this.toOrderItems());
    order.setUserId(userId);
    return order;
  }

  public List<OrderItem> toOrderItems() {
    return items.stream()
        .map(item -> OrderItem.builder().count(item.getCount()).goodsId(item.getGoodsId())
            .price(item.getPrice()).build()).collect(Collectors.toList());
  }
}
