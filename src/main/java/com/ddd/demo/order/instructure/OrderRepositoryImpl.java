package com.ddd.demo.order.instructure;

import com.ddd.demo.order.domain.Order;
import com.ddd.demo.order.domain.OrderRepository;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class OrderRepositoryImpl implements OrderRepository {

  private final OrderJPARepository orderJPARepository;
  private final OrderItemJPARepository orderItemJPARepository;

  @Override
  public void save(Order order) {

    OrderPo orderPo = new OrderPo();
    orderJPARepository.save(orderPo);
    orderItemJPARepository.saveAll(
        order.getOrderItems().stream().map(item -> new OrderItemPo(item, orderPo.getId())).collect(
            Collectors.toList()));
  }
}
