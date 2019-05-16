package com.company.onlineshop.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.EmbeddedParameters;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "ONLINESHOP_BUYER")
@Entity(name = "onlineshop$Buyer")
public class Buyer extends StandardEntity {
    @NotNull
    @Column(name = "FULL_NAME", nullable = false)
    protected String fullName;

    @Embedded
    @EmbeddedParameters(nullAllowed = false)
    @AttributeOverrides({
            @AttributeOverride(name = "city", column = @Column(name = "ADDRESS_CITY")),
            @AttributeOverride(name = "street", column = @Column(name = "ADDRESS_STREET")),
            @AttributeOverride(name = "house", column = @Column(name = "ADDRESS_HOUSE"))
    })
    protected Address address;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    protected User user;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "buyer", optional = false)
    protected ExtUser extUser;

    public ExtUser getExtUser() {
        return extUser;
    }

    public void setExtUser(ExtUser extUser) {
        this.extUser = extUser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}