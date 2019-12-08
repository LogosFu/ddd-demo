package com.ddd.demo.event;

import com.ddd.demo.order.domain.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class OrderCreatedEvent {
    private Order order;
}
