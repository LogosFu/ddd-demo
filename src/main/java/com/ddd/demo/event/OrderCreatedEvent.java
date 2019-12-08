package com.ddd.demo.event;

import com.ddd.demo.order.domain.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class OrderCreatedEvent {
    private Order order;
}
