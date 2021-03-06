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
 * City generated by hbm2java
 */
@Entity
@Table(name = "city",
         catalog = "erpcommerce"
)
public class City implements java.io.Serializable {

    private String cityName;
    private State state;
    private String latitude;
    private String longitude;
    private Set<Addresses> addresseses = new HashSet<Addresses>(0);

    public City() {
    }

    public City(String cityName, State state) {
        this.cityName = cityName;
        this.state = state;
    }

    public City(String cityName, State state, String latitude, String longitude, Set<Addresses> addresseses) {
        this.cityName = cityName;
        this.state = state;
        this.latitude = latitude;
        this.longitude = longitude;
        this.addresseses = addresseses;
    }

    @Id

    @Column(name = "city_name", unique = true, nullable = false)
    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state_name", nullable = false)
    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Column(name = "latitude", length = 20)
    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Column(name = "longitude", length = 20)
    public String getLongitude() {
        return this.longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    public Set<Addresses> getAddresseses() {
        return this.addresseses;
    }

    public void setAddresseses(Set<Addresses> addresseses) {
        this.addresseses = addresseses;
    }

}
