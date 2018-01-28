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
@Table(name = "m_role", schema = "myapp")
public class Role {
    @Id
    @Column(name = "id") @Getter @Setter
    private int id;
    @Column(name = "role_name") @Getter @Setter
    private String roleName;
    @Column(name = "create_dt") @Getter @Setter
    private Date createDt;
}
