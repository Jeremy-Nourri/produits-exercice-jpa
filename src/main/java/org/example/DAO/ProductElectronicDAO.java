package org.example.DAO;

import org.example.Entity.ProductElectronic;

import javax.persistence.EntityManager;
import java.util.List;

public class ProductElectronicDAO extends BaseDAO<ProductElectronic> {
    public ProductElectronicDAO(EntityManager em) {
        super(em);
    }

    @Override
    public void save(ProductElectronic element) {
        em.getTransaction().begin();
        em.persist(element);
        em.getTransaction().commit();
    }

    @Override
    public void delete(ProductElectronic element) {
        em.getTransaction().begin();
        em.remove(element);
        em.getTransaction().commit();
    }

    @Override
    public ProductElectronic findById(int id) {
        return em.find(ProductElectronic.class,id);
    }

    @Override
    public List<ProductElectronic> findAll() {
        return em.createQuery("SELECT pe from ProductElectronic pe").getResultList();
    }
}
