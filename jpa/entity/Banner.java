package cn.springlogic.ad.jpa.entity;

import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 2017/4/15.
 */
@Data
@Entity
public class Banner {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int id;

 private String title;

 private String image;

 private String link;

 @Column(name = "create_time")
 @CreationTimestamp
 private Date createTime;



}
