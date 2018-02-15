package com.b2berp.b2bmodel.core;
// Generated Feb 4, 2018 10:28:18 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * State generated by hbm2java
 */
@Entity
@Table(name = "state",
         catalog = "erpcommerce"
)
public class State implements java.io.Serializable {

    private String stateName;
    private Country country;
    private String stateCode2;
    private String stateCode3;
    private Set<City> cities = new HashSet<City>(0);
    private Set<Addresses> addresseses = new HashSet<Addresses>(0);

    public State() {
    }

    public State(String stateName, Country country) {
        this.stateName = stateName;
        this.country = country;
    }

    public State(String stateName, Country country, String stateCode2, String stateCode3, Set<City> cities, Set<Addresses> addresseses) {
        this.stateName = stateName;
        this.country = country;
        this.stateCode2 = stateCode2;
        this.stateCode3 = stateCode3;
        this.cities = cities;
        this.addresseses = addresseses;
    }

    @Id

    @Column(name = "state_name", unique = true, nullable = false)
    public String getStateName() {
        return this.stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_name", nullable = false)
    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Column(name = "state_code2", length = 2)
    public String getStateCode2() {
        return this.stateCode2;
    }

    public void setStateCode2(String stateCode2) {
        this.stateCode2 = stateCode2;
    }

    @Column(name = "state_code3", length = 3)
    public String getStateCode3() {
        return this.stateCode3;
    }

    public void setStateCode3(String stateCode3) {
        this.stateCode3 = stateCode3;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "state")
    public Set<City> getCities() {
        return this.cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "state")
    public Set<Addresses> getAddresseses() {
        return this.addresseses;
    }

    public void setAddresseses(Set<Addresses> addresseses) {
        this.addresseses = addresseses;
    }

}
