package com.bendiamand.cabas.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "citizen")
public class Citizen {

    // == Fields ==
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "identity_no")
    private String identityNo;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone")
    private String phone;

    @ManyToOne
    @JoinColumn(name = "guardian_id")
    private Citizen guardian;


    @Getter(AccessLevel.NONE)
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "city_id")
    private City city;

    // == Constructors ==
    public Citizen() {

    }

    public Citizen(String identityNo, String firstName, String lastName, String phone, Citizen guardian, City city) {
        this.identityNo = identityNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.guardian = guardian;
        this.city = city;
    }

    public Citizen(String identityNo, String firstName, String lastName, String phone, City city) {
        this.identityNo = identityNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.city = city;
    }

    // == Public Methods ==


    @Override
    public String toString() {
        return "Citizen{" +
                "id=" + id +
                ", identityNo='" + identityNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", guardian=" + guardian +
                ", city=" + city +
                '}';
    }
}
