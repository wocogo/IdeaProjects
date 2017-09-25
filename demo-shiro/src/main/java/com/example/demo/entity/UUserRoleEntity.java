package com.example.demo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator on 2017/9/24.
 */
@Entity
@Table(name = "u_user_role", schema = "helssm", catalog = "")
public class UUserRoleEntity {
    private Long uid;
    private Long rid;

    @Basic
    @Column(name = "uid")
    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    @Basic
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
