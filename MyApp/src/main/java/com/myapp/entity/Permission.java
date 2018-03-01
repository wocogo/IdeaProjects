package com.myapp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Administrator on 2018/1/26.
 */
@Entity
@Table(name = "m_permission", schema = "myapp")
public class Permission {
    @Id
    @Column(name = "id") @Getter @Setter
    private int id;
    @Column(name = "url") @Getter @Setter
    private String url;
    @Column(name = "create_dt") @Getter @Setter
    private Date createDt;
}
