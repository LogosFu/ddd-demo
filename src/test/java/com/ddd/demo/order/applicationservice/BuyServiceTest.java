package com.ddd.demo.order.applicationservice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.ddd.demo.order.controller.dto.OrderCreateDto;
import com.ddd.demo.order.controller.dto.OrderDto;
import com.ddd.demo.order.controller.dto.OrderItemDto;
import com.ddd.demo.order.domain.Order;
import com.ddd.demo.order.domain.OrderItem;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BuyServiceTest {

  @Autowired
  private BuyService buyService;

  @Test
  void should_save_order_when_given_a_order_info() {

    OrderItem itemDto = OrderItem.builder().price(BigDecimal.TEN).goodsId(1).count(1).build();
    OrderItem itemDto1 = OrderItem.builder().price(BigDecimal.TEN).goodsId(2).count(1).build();
    OrderItem itemDto2 = OrderItem.builder().price(BigDecimal.TEN).goodsId(3).count(1).build();
    OrderItem itemDto3 = OrderItem.builder().price(BigDecimal.TEN).goodsId(4).count(1).build();
    List<OrderItem> items = Arrays.asList(itemDto, itemDto1, itemDto2, itemDto3);
    Order order = buyService.createOrderCommand(Order.builder()
        .orderItems(items).userId(1).freight(new BigDecimal(20))
        .build());
    assertThat(Objects.nonNull(order)).isTrue();
  }
}