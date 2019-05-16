package com.company.onlineshop.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.cuba.core.entity.EmbeddableEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable

@MetaClass(name = "onlineshop$Address")
public class Address extends EmbeddableEntity {
    @NotNull
    @Column(name = "CITY", nullable = false)
    protected String city;

    @NotNull
    @Column(name = "STREET", nullable = false)
    protected String street;

    @NotNull
    @Column(name = "HOUSE", nullable = false)
    protected String house;

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}