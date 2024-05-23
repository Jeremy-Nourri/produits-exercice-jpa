package org.example.DAO;

import org.example.Entity.ProductHousing;

import javax.persistence.EntityManager;
import java.util.List;

public class ProductHousingDAO extends BaseDAO<ProductHousing> {
    public ProductHousingDAO(EntityManager em) {
        super(em);
    }

    @Override
    public void save(ProductHousing element) {
        em.getTransaction().begin();
        em.persist(element);
        em.getTransaction().commit();
    }

    @Override
    public void delete(ProductHousing element) {
        em.getTransaction().begin();
        em.remove(element);
        em.getTransaction().commit();
    }

    @Override
    public ProductHousing findById(int id) {
        return em.find(ProductHousing.class,id);
    }

    @Override
    public List<ProductHousing> findAll() {
        return em.createQuery("SELECT pe from ProductHousing pe").getResultList();
    }
}