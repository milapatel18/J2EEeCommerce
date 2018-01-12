/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erpcommerce.erpservices;

import com.erpcommerce.erpmodel.core.User;

/**
 *
 * @author Milap Patel
 */
public interface UserService extends GenericService<User, Long> {

    User findByUserName(String username);

}
