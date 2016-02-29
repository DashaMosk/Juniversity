package com.juniversity.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by Daria_Moskalenko on 2/26/2016.
 */
@Entity
@Table(name = "ADRESSES")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private AddressType type;
    private String value;
    private Users user;
    private LocalDateTime creationDate;
    private  LocalDateTime modifDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AddressType getType() {
        return type;
    }

    public void setType(AddressType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getModifDate() {
        return modifDate;
    }

    public void setModifDate(LocalDateTime modifDate) {
        this.modifDate = modifDate;
    }
}
