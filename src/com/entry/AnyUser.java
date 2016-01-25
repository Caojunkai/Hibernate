package com.entry;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "any_user", schema = "anymall", catalog = "")
public class AnyUser {
    private int id;
    private String name;
    private String password;
    private Integer sex;
    private String email;
    private Date ctime;
    private String face;


    public AnyUser() {
    }

    public AnyUser(String name, String password, Integer sex, String email, Date ctime, String face) {
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.email = email;
        this.ctime = ctime;
        this.face = face;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "sex", nullable = true)
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "ctime", nullable = true)
    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    @Basic
    @Column(name = "face", nullable = true, length = 255)
    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnyUser anyUser = (AnyUser) o;

        if (id != anyUser.id) return false;
        if (name != null ? !name.equals(anyUser.name) : anyUser.name != null) return false;
        if (password != null ? !password.equals(anyUser.password) : anyUser.password != null) return false;
        if (sex != null ? !sex.equals(anyUser.sex) : anyUser.sex != null) return false;
        if (email != null ? !email.equals(anyUser.email) : anyUser.email != null) return false;
        if (ctime != null ? !ctime.equals(anyUser.ctime) : anyUser.ctime != null) return false;
        if (face != null ? !face.equals(anyUser.face) : anyUser.face != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (ctime != null ? ctime.hashCode() : 0);
        result = 31 * result + (face != null ? face.hashCode() : 0);
        return result;
    }
}
