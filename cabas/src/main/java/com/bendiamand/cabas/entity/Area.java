package com.bendiamand.cabas.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "area")
public class Area {

    // == Fields ==
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "area_no")
    private String areaNo;

//    @Getter(AccessLevel.NONE)
    @OneToMany(fetch=FetchType.LAZY, mappedBy = "area", cascade=CascadeType.ALL)
    private List<City> cities;

    // == Constructors ==
    public Area() {

    }

    public Area(String name, String areaNo) {
        this.name = name;
        this.areaNo = areaNo;
    }

    public Area(int id, String name, String areaNo, List<City> cities) {
        this.id = id;
        this.name = name;
        this.areaNo = areaNo;
        this.cities = cities;
    }

    // == Public Methods ==

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", areaNo='" + areaNo + '\'' +
                '}';
    }
}
