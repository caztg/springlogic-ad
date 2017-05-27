package cn.springlogic.ad.jpa.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by admin on 2017/4/15.
 */
@Data
@Entity
public class Position {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String name;

  @Column(name = "create_time")
  @CreationTimestamp
  private Date createTime;

}
