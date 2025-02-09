package com.studentapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class Student {

    @Id
    private long id;
    private String name;
    private String address;
    private double salary;

}
