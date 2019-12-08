package com.ddd.demo.order.applicationservice;

import com.ddd.demo.event.OrderCreatedEvent;
import com.ddd.demo.order.domain.Order;
import com.ddd.demo.order.domain.OrderItem;
import com.ddd.demo.order.domain.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BuyService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher eventPublisher;

    private final OrderRepository orderRepository;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }

    public Order createOrderCommand(List<OrderItem> orderItems) {

        Order order = new Order();
        order.create(orderItems);
        orderRepository.save(order);

        eventPublisher.publishEvent(OrderCreatedEvent.builder().order(order).build());

        return order;
    }
}
