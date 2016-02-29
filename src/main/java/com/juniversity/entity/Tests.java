package com.juniversity.entity;

import javax.persistence.*;

/**
 * Created by Daria_Moskalenko on 2/29/2016.
 */
@Entity
@Table(name = "TESTS")
public class Tests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
}
