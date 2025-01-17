package com.codegym.qltcbe.model.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private AppUser appUser;

    @Column(columnDefinition = "int default 1")
    private int status;

    public Category(String name, AppUser appUser, int status) {
        this.name = name;
        this.appUser = appUser;
        this.status = status;
    }
}
