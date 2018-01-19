/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erpcommerce.erpservices.impl;

import com.erpcommerce.erpmodel.core.User;
import com.erpcommerce.erpmodel.core.dao.GenericDao;
import com.erpcommerce.erpmodel.core.dao.UserDao;
import com.erpcommerce.erpservices.UserService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Milap Patel
 */
@Service("userService")
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

    private UserDao userDao;

    public UserServiceImpl() {

    }

    @Autowired
    public UserServiceImpl(@Qualifier("userDao") GenericDao<User, Long> genericDao) {
        super(genericDao);
        this.userDao = (UserDao) genericDao;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public User findByUserName(String username) {
        User user = userDao.findByUserName(username);
        if (user.getId() != null) {
            Hibernate.initialize(user.getRoles());
        }
        return userDao.findByUserName(username);
    }

}
