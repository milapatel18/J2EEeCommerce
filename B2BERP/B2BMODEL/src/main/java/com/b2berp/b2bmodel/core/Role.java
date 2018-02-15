package com.b2berp.b2bmodel.core;
// Generated Feb 4, 2018 10:28:18 PM by Hibernate Tools 4.3.1

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "role",
         catalog = "erpcommerce"
)
public class Role implements java.io.Serializable {

    private Long id;
    private User user;
    private String roleName;
    private String roleDesc;
    private Long roleParent;
    private int active;
    private Date createdAt;
    private Date updatedAt;
    private Set<User> users = new HashSet<User>(0);

    public Role() {
    }

    public Role(String roleName, String roleDesc, int active, Date createdAt, Date updatedAt) {
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Role(User user, String roleName, String roleDesc, Long roleParent, int active, Date createdAt, Date updatedAt, Set<User> users) {
        this.user = user;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.roleParent = roleParent;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.users = users;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USERS_ID")
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "ROLE_NAME", nullable = false)
    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Column(name = "ROLE_DESC", nullable = false)
    public String getRoleDesc() {
        return this.roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    @Column(name = "ROLE_PARENT")
    public Long getRoleParent() {
        return this.roleParent;
    }

    public void setRoleParent(Long roleParent) {
        this.roleParent = roleParent;
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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles", catalog = "erpcommerce", joinColumns = {
        @JoinColumn(name = "ROLE_ID", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "USER_ID", nullable = false, updatable = false)})
    public Set<User> getUsers() {
        return this.users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

}
