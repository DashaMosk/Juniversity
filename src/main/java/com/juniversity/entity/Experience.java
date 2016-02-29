package com.juniversity.entity;

import java.time.LocalDate;

/**
 * Created by Daria_Moskalenko on 2/29/2016.
 */
public class Experience {
    private long id;
    private String companyName;
    private  String title;
    private String location;
    private  String description;
    private boolean workTillNow;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private Users user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isWorkTillNow() {
        return workTillNow;
    }

    public void setWorkTillNow(boolean workTillNow) {
        this.workTillNow = workTillNow;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
