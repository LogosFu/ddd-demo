package com.ddd.demo;

import com.ddd.demo.stock.domain.Stock;
import com.ddd.demo.stock.instructure.StockRepository;
import com.ddd.demo.user.domain.User;
import com.ddd.demo.user.instructure.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StockRepository stockRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setId(1);
        user.setIsVip(false);
        user.setTelephone("13000000000");
        userRepository.saveAndFlush(user);

        Stock stock = new Stock();
        stock.setGoodsId(1);
        stock.setId(1);
        stock.setCount(10);
        stockRepository.saveAndFlush(stock);

        stock = new Stock();
        stock.setGoodsId(2);
        stock.setId(2);
        stock.setCount(1000);
        stockRepository.saveAndFlush(stock);
    }
}
