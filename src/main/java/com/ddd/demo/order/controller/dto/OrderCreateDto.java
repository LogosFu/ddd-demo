package com.ddd.demo.order.controller.dto;

import com.ddd.demo.order.domain.OrderItem;
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

  private List<OrderItemDto> items;

 public List<OrderItem> toOrderItems() {

    return items.stream()
        .map(item -> OrderItem.builder().count(item.getCount()).goodsId(item.getGoodsId())
            .price(item.getPrice()).build()).collect(Collectors.toList());
  }
}
