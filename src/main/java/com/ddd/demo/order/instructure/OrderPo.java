package com.ddd.demo.order.instructure;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "order")
public class OrderPo {

  @Id
  private Integer id;

  @OneToMany
  @JoinTable(name = "order_item", joinColumns = {@JoinColumn(name = "order_id")})
  private List<OrderItemPo> items;
}
