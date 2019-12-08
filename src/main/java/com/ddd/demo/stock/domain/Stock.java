package com.ddd.demo.stock.domain;

import com.ddd.demo.AggregationRoot;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Stock implements AggregationRoot {
    private Integer id;
    private Integer goodsId;
    private Integer count;

    public boolean decrease(Integer count) {
        int swap = this.count - count;
        if (swap < 0) {
            return false;
        }
        this.count = swap;
        return true;
    }
}
