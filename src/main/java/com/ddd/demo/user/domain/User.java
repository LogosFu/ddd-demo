package com.ddd.demo.user.domain;

import com.ddd.demo.AggregationRoot;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class User implements AggregationRoot {
    private Integer id;
    private Boolean isVip;
    private String telephone;

    public boolean upgradeToVIP() {
        if (isVip) {
            return false;
        }
        isVip = true;
        return true;
    }
}
