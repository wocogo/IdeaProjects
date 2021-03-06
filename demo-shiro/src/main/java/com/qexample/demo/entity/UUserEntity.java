package com.qexample.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2017/9/24.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "u_user", schema = "helssm", catalog = "")
public class UUserEntity {
    private long id;
    private String nickname;
    private String email;
    private String pswd;

    //@Column(insertable = false, updatable = false)
    //@Generated(GenerationTime.ALWAYS)
//    @CreationTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    private Date lastLoginTime;
    private Long status;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "pswd")
    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    @Basic
    @Column(name = "create_time", updatable = false)
    @CreationTimestamp
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "last_login_time", insertable = false, updatable = false)
//    @UpdateTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Basic
    @Column(name = "status")
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UUserEntity that = (UUserEntity) o;

        if (id != that.id) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (pswd != null ? !pswd.equals(that.pswd) : that.pswd != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (lastLoginTime != null ? !lastLoginTime.equals(that.lastLoginTime) : that.lastLoginTime != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (pswd != null ? pswd.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (lastLoginTime != null ? lastLoginTime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
