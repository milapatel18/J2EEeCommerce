/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erpcommerce.erpmodel.core.dao.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author milap.patel
 */
public class PasswordEncoderGenerator {
    public static void main(String[] args) {

	int i = 0;
	while (i < 10) {
		String password = "123456";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
                
		String hashedPassword = passwordEncoder.encode(password);
                
		System.out.println(hashedPassword);
                System.out.println(passwordEncoder.matches("123456", hashedPassword));
		i++;
	}

  }
}
