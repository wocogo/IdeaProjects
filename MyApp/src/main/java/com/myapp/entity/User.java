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
@Table(name = "m_user", schema = "myapp")
public class User {
    @Id @Column(name = "id") @Getter @Setter
    private int id;
    @Column(name = "user_name") @Getter @Setter
    private String userName;
    @Column(name = "user_pwd") @Getter @Setter
    private String userPwd;
    @Column(name = "create_dt") @Getter @Setter
    private Date createDt;
}
