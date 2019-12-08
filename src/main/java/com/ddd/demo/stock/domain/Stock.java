package com.ddd.demo.stock.domain;

import com.ddd.demo.AggregationRoot;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Stock implements AggregationRoot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
