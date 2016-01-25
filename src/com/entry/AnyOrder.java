package com.entry;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class AnyOrder implements Serializable {
    private int id;
    private AnyUser anyUser;
    private Date ctime;
    private Date utime;
    private int status;
    private Double amount;
    private Set<AnyOrderItem> anyOrderItems;

    public AnyOrder() {
    }

    public AnyOrder(AnyUser anyUser, Date ctime, Date utime, int status, Double amount, Set<AnyOrderItem> anyOrderItems) {
        this.anyUser = anyUser;
        this.ctime = ctime;
        this.utime = utime;
        this.status = status;
        this.amount = amount;
        this.anyOrderItems = anyOrderItems;
    }

    public AnyOrder(AnyUser anyUser, Date ctime, Date utime, int status, Double amount) {
        this.anyUser = anyUser;
        this.ctime = ctime;
        this.utime = utime;
        this.status = status;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AnyUser getAnyUser() {
        return anyUser;
    }

    public void setAnyUser(AnyUser anyUser) {
        this.anyUser = anyUser;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Set<AnyOrderItem> getAnyOrderItems() {
        return anyOrderItems;
    }

    public void setAnyOrderItems(Set<AnyOrderItem> anyOrderItems) {
        this.anyOrderItems = anyOrderItems;
    }

    @Override
    public String toString() {
        return "AnyOrder{" +
                "id=" + id +
                ", anyUser=" + anyUser +
                ", ctime=" + ctime +
                ", utime=" + utime +
                ", status=" + status +
                ", amount=" + amount +
                ", anyOrderItems=" + anyOrderItems +
                '}';
    }
}
