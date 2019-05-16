package com.company.onlineshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity(name = "onlineshop$NaturalBuyer")
public class NaturalBuyer extends Buyer {
    @NotNull
    @Column(name = "LAST_NAME", nullable = false)
    protected String lastName;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    protected String firstName;

    @NotNull
    @Column(name = "PATRONYMIC", nullable = false)
    protected String patronymic;

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}