package com.ddd.demo.user.domain;

import com.ddd.demo.AggregationRoot;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User implements AggregationRoot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
