package com.qexample.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/9/24.
 */
@Entity
@Table(name = "u_user_role", schema = "helssm", catalog = "")
public class UUserRoleEntity implements Serializable{
    private Long uid;
    private Long rid;

    @Id
    @Column(name = "uid")
    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    @Id
    @Column(name = "rid")
    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UUserRoleEntity that = (UUserRoleEntity) o;

        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (rid != null ? !rid.equals(that.rid) : that.rid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid != null ? uid.hashCode() : 0;
        result = 31 * result + (rid != null ? rid.hashCode() : 0);
        return result;
    }
}
