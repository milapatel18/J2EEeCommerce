/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erpcommerce.erpmodel.core.dao;

import com.erpcommerce.erpmodel.core.User;

/**
 *
 * @author Milap Patel
 */
public interface UserDao extends GenericDao<User, Long> {

    User findByUserName(String username);

}
