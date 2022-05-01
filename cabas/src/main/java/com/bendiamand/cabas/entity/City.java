package com.bendiamand.cabas.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "city")
public class City {

    // == Fields ==
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Getter(AccessLevel.NONE)
    @ManyToOne(fetch=FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "area_id")
    private Area area;

//    @Getter(AccessLevel.NONE)
    @OneToMany(fetch=FetchType.LAZY, mappedBy = "city", cascade=CascadeType.ALL)
    private List<Citizen> citizens;

    // == Constructors ==
    public City() {

    }

    public City(String name, Area area) {
        this.name = name;
        this.area = area;
    }

    // == Public Methods ==
    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", citizens=" + citizens +
                '}';
    }
}
