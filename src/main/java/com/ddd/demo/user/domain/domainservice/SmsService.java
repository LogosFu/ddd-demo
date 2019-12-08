package com.ddd.demo.user.domain.domainservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SmsService {

    public void sendMsg(String telephone) {
        log.debug("{},your order created successfully.", telephone);
    }
}
