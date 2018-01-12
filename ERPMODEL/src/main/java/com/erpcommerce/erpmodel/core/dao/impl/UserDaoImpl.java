/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erpcommerce.erpmodel.core.dao.impl;

import com.erpcommerce.erpmodel.core.User;
import com.erpcommerce.erpmodel.core.dao.UserDao;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Milap Patel
 */
@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<User, Long> implements UserDao {

    public User findByUserName(String username) {

//        List<User> users = new ArrayList<User>();
//
//        users = currentSession().createQuery("from User where loginid=?")
//                .setParameter(0, username).list();
//
//        if (users.size() > 0) {
//            return users.get(0);
//        } else {
//            return null;
//        }
        Query query = currentSession().createQuery(
                "from User where loginid=:loginid");
        query.setParameter("loginid", username);
        System.out.println("+++++ ");
        return (User) query.uniqueResult();

    }

}
