package com.juniversity.entity;

import java.time.LocalDate;

/**
 * Created by Daria_Moskalenko on 2/29/2016.
 */
public class Skills {
    private long id;
    private Users user;
    private SkillsCat skill;
    private boolean isConfirmed;
    private LocalDate dateConf;
    private double score;
    private Tests test;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public SkillsCat getSkill() {
        return skill;
    }

    public void setSkill(SkillsCat skill) {
        this.skill = skill;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

    public LocalDate getDateConf() {
        return dateConf;
    }

    public void setDateConf(LocalDate dateConf) {
        this.dateConf = dateConf;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Tests getTest() {
        return test;
    }

    public void setTest(Tests test) {
        this.test = test;
    }
}
