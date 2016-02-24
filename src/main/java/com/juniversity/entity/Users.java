package com.juniversity.entity;

import java.time.LocalDateTime;

/**
 * Created by Daria_Moskalenko on 2/24/2016.
 */
public class Users {
    private long id;
    private String name;
    private String baseEmail;
    private long country;
    private String city;
    private LocalDateTime registryDate;
    private LocalDateTime lastVisitDate;
    private LocalDateTime blockDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseEmail() {
        return baseEmail;
    }

    public void setBaseEmail(String baseEmail) {
        this.baseEmail = baseEmail;
    }

    public long getCountry() {
        return country;
    }

    public void setCountry(long country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getRegistryDate() {
        return registryDate;
    }

    public void setRegistryDate(LocalDateTime registryDate) {
        this.registryDate = registryDate;
    }

    public LocalDateTime getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(LocalDateTime lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public LocalDateTime getBlockDate() {
        return blockDate;
    }

    public void setBlockDate(LocalDateTime blockDate) {
        this.blockDate = blockDate;
    }
}
