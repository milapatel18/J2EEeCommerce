package com.b2berp.b2brepository.dao.impl;

import com.b2berp.b2brepository.dao.ModulesDAO;
import com.b2berp.b2bmodel.core.Modules;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ModulesDAOImpl extends GenericDaoImpl<Modules, Long> implements ModulesDAO {

    public static ModulesDAOImpl modulesDAOImpl = new ModulesDAOImpl();

    private ModulesDAOImpl() {
    }

    public static ModulesDAOImpl getInstance() {
        return modulesDAOImpl;
    }

    @Override
    public boolean isModuleExistByName(Modules modules) {
        Map<String, Object> map = new HashMap<>();
        map.put("moduleName", modules.getModuleName());
        List<Modules> list = this.getAll(map, 0, 100);
        System.out.println("list " + list.size());
        return list.size() > 0;
    }

    @Override
    public Modules getSubModules(Modules modules) {
        Modules modules1 = null;
        Session session = currentSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            if (modules.getId() != null) {
                modules1 = (Modules) session.find(Modules.class, modules.getId());
                Hibernate.initialize(modules.getModules());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return modules1;

    }

    @Override
    public void adds(Modules modules) {
        Session session = currentSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(modules);
            Modules p = (Modules) session.find(Modules.class, modules.getModules().getId());
            p.setHasChildren(1);
            session.merge(p);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
