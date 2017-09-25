package com.example.demo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator on 2017/9/24.
 */
@Entity
@Table(name = "u_role_permission", schema = "helssm", catalog = "")
public class URolePermissionEntity {
    private Long rid;
    private Long pid;

    @Basic
    @Column(name = "rid")
    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "pid")
    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        URolePermissionEntity that = (URolePermissionEntity) o;

        if (rid != null ? !rid.equals(that.rid) : that.rid != null) return false;
        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rid != null ? rid.hashCode() : 0;
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        return result;
    }
}
