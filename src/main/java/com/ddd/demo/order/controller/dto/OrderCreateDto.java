package com.ddd.demo.order.controller.dto;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderCreateDto {

  List<OrderItemDto> items;
}
