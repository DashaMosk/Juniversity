package com.juniversity.entity;

/**
 * Created by Daria_Moskalenko on 2/29/2016.
 */
public class SkillsCat {
    private long id;
    private String name;
    private boolean canBeConfirmed;

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
}
