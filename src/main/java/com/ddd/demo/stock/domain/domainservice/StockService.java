package com.ddd.demo.stock.domain.domainservice;

import com.ddd.demo.stock.domain.Stock;
import com.ddd.demo.stock.instructure.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public Stock getByGoodsId(Integer goodsId) {
        return stockRepository.getByGoodsId(goodsId);
    }
}
