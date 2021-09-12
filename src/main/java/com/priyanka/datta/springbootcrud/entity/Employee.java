package com.priyanka.datta.springbootcrud.entity;

import lombok.*;

import javax.annotation.Generated;
import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_ID")
    private Integer id;

    @Column(name = "EMPLOYEE_NAME")
    private String name;

    @Column(name = "YEARS_OF_EXPERIENCE")
    private Integer experience;
}
