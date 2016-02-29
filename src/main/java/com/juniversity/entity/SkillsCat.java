package com.juniversity.entity;

import javax.persistence.*;

/**
 * Created by Daria_Moskalenko on 2/29/2016.
 */
@Entity
@Table(name = "SKILLSCAT")
public class SkillsCat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private boolean canBeConfirmed;
    private Tests test;

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

    public boolean isCanBeConfirmed() {
        return canBeConfirmed;
    }

    public void setCanBeConfirmed(boolean canBeConfirmed) {
        this.canBeConfirmed = canBeConfirmed;
    }

    public Tests getTest() {
        return test;
    }

    public void setTest(Tests test) {
        this.test = test;
    }
}
