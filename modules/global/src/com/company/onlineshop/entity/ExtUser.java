package com.company.onlineshop.entity;

import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Extends(User.class)
@Entity(name = "onlineshop$ExtUser")
public class ExtUser extends User {
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BUYER_ID")
    protected Buyer buyer;

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
}