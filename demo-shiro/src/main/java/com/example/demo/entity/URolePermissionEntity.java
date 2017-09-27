package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/9/24.
 */
@Entity
@Table(name = "u_role_permission", schema = "helssm", catalog = "")
public class URolePermissionEntity implements Serializable {
    private Long rid;
    private Long pid;

    @Id
    @Column(name = "rid")
    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    @Id
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
