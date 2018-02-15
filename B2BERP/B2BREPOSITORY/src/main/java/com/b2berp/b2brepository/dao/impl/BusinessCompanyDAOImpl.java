package com.b2berp.b2brepository.dao.impl;

import com.b2berp.b2brepository.dao.BusinessCompanyDAO;
import com.b2berp.b2bmodel.core.BusinessCompany;

public class BusinessCompanyDAOImpl extends GenericDaoImpl<BusinessCompany, Long> implements BusinessCompanyDAO {

    public static BusinessCompanyDAOImpl businessCompanyDAOImpl = new BusinessCompanyDAOImpl();

    private BusinessCompanyDAOImpl() {
    }

    public static BusinessCompanyDAOImpl getInstance() {
        return businessCompanyDAOImpl;
    }
}
