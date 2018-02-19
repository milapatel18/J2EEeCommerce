package com.erpcommerce.erpmodel.core;
// Generated Feb 4, 2018 9:43:25 AM by Hibernate Tools 4.3.1


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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BusinessCompany generated by hbm2java
 */
@Entity
@Table(name="business_company"
    ,catalog="erpcommerce"
)
public class BusinessCompany  implements java.io.Serializable {


     private Long id;
     private User user;
     private String businessName;
     private String businessId;
     private String category;
     private int active;
     private Date createdAt;
     private Date updatedAt;
     private Set<Addresses> addresseses = new HashSet<Addresses>(0);
     private Set<Modules> moduleses = new HashSet<Modules>(0);
     private Set<Clients> clientses = new HashSet<Clients>(0);
     private Set<AttributeTypes> attributeTypeses = new HashSet<AttributeTypes>(0);
     private Set<User> users = new HashSet<User>(0);

    public BusinessCompany() {
    }

	
    public BusinessCompany(String businessName, String businessId, int active, Date createdAt, Date updatedAt) {
        this.businessName = businessName;
        this.businessId = businessId;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public BusinessCompany(User user, String businessName, String businessId, String category, int active, Date createdAt, Date updatedAt, Set<Addresses> addresseses, Set<Modules> moduleses, Set<Clients> clientses, Set<AttributeTypes> attributeTypeses, Set<User> users) {
       this.user = user;
       this.businessName = businessName;
       this.businessId = businessId;
       this.category = category;
       this.active = active;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
       this.addresseses = addresseses;
       this.moduleses = moduleses;
       this.clientses = clientses;
       this.attributeTypeses = attributeTypeses;
       this.users = users;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    
    @Column(name="business_name", nullable=false)
    public String getBusinessName() {
        return this.businessName;
    }
    
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    
    @Column(name="business_id", nullable=false, length=100)
    public String getBusinessId() {
        return this.businessId;
    }
    
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    
    @Column(name="category")
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    
    @Column(name="ACTIVE", nullable=false)
    public int getActive() {
        return this.active;
    }
    
    public void setActive(int active) {
        this.active = active;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED_AT", nullable=false, length=19)
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UPDATED_AT", nullable=false, length=19)
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="businessCompany")
    public Set<Addresses> getAddresseses() {
        return this.addresseses;
    }
    
    public void setAddresseses(Set<Addresses> addresseses) {
        this.addresseses = addresseses;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="business_modules", catalog="erpcommerce", joinColumns = { 
        @JoinColumn(name="business_company_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="modules_id", nullable=false, updatable=false) })
    public Set<Modules> getModuleses() {
        return this.moduleses;
    }
    
    public void setModuleses(Set<Modules> moduleses) {
        this.moduleses = moduleses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="businessCompany")
    public Set<Clients> getClientses() {
        return this.clientses;
    }
    
    public void setClientses(Set<Clients> clientses) {
        this.clientses = clientses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="businessCompany")
    public Set<AttributeTypes> getAttributeTypeses() {
        return this.attributeTypeses;
    }
    
    public void setAttributeTypeses(Set<AttributeTypes> attributeTypeses) {
        this.attributeTypeses = attributeTypeses;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="business_users", catalog="erpcommerce", joinColumns = { 
        @JoinColumn(name="BUSINESS_COMPANY_ID", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="USER_ID", nullable=false, updatable=false) })
    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }




}


