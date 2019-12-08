package com.ddd.demo.user.domain.domainservice;

import com.ddd.demo.event.OrderCreatedEvent;
import com.ddd.demo.user.domain.User;
import com.ddd.demo.user.instructure.UserRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private SmsService smsService;

  @EventListener(OrderCreatedEvent.class)
  @Transactional
  public void onOrderCreatedEvent(OrderCreatedEvent event) {
    User user = userRepository.getOne(event.getOrder().getUserId());
    smsService.sendMsg(user.getTelephone());
  }

  public User getById(Integer id) {
    return userRepository.getOne(id);
  }
}
