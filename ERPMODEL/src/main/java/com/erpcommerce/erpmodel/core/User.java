package com.erpcommerce.erpmodel.core;
// Generated Jan 10, 2018 6:48:33 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user",
         catalog = "erpcommerce"
)
public class User implements java.io.Serializable {

    private Long id;
    private String fname;
    private String lname;
    private String email;
    private String loginid;
    private String password;
    private String phoneHome;
    private String phonePersonal;
    private String userType;
    private String designation;
    private int active;
    private Date createdAt;
    private Date updatedAt;
    private Set<Role> roles = new HashSet<Role>(0);
    private Set<BusinessCompany> businessCompanies = new HashSet<BusinessCompany>(0);

    public User() {
    }

    public User(String fname, String lname, String userType, int active, Date createdAt, Date updatedAt) {
        this.fname = fname;
        this.lname = lname;
        this.userType = userType;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public User(String fname, String lname, String email, String loginid, String password, String phoneHome, String phonePersonal, String userType, String designation, int active, Date createdAt, Date updatedAt, Set<Role> roles, Set<BusinessCompany> businessCompanies) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.loginid = loginid;
        this.password = password;
        this.phoneHome = phoneHome;
        this.phonePersonal = phonePersonal;
        this.userType = userType;
        this.designation = designation;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.roles = roles;
        this.businessCompanies = businessCompanies;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FNAME", nullable = false, length = 111)
    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Column(name = "LNAME", nullable = false, length = 111)
    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Column(name = "EMAIL", length = 150)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "LOGINID", length = 50)
    public String getLoginid() {
        return this.loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    @Column(name = "PASSWORD", length = 100)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "PHONE_HOME", length = 15)
    public String getPhoneHome() {
        return this.phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    @Column(name = "PHONE_PERSONAL", length = 15)
    public String getPhonePersonal() {
        return this.phonePersonal;
    }

    public void setPhonePersonal(String phonePersonal) {
        this.phonePersonal = phonePersonal;
    }

    @Column(name = "USER_TYPE", nullable = false, length = 20)
    public String getUserType() {
        return this.userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Column(name = "DESIGNATION")
    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Column(name = "ACTIVE", nullable = false)
    public int getActive() {
        return this.active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_AT", nullable = false, length = 19)
    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_AT", nullable = false, length = 19)
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles", catalog = "erpcommerce", joinColumns = {
        @JoinColumn(name = "USER_ID", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "ROLE_ID", nullable = false, updatable = false)})
    public Set<Role> getRoles() {
        return this.roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "business_users", catalog = "erpcommerce", joinColumns = {
        @JoinColumn(name = "USER_ID", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "BUSINESS_COMPANY_ID", nullable = false, updatable = false)})
    public Set<BusinessCompany> getBusinessCompanies() {
        return this.businessCompanies;
    }

    public void setBusinessCompanies(Set<BusinessCompany> businessCompanies) {
        this.businessCompanies = businessCompanies;
    }

}
