package com.ddd.demo.stock.domain.domainservice;

import com.ddd.demo.event.OrderCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @EventListener(OrderCreatedEvent.class)
    public void onOrderCreatedEvent(OrderCreatedEvent event) {

    }
}
