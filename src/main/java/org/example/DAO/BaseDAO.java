package org.example.DAO;

import javax.persistence.EntityManager;
import java.util.List;

public abstract class BaseDAO<T> {
    protected EntityManager em;

    public BaseDAO(EntityManager em) {
        this.em = em;
    }

    public abstract void save (T element);
    public abstract void delete (T element);
    public abstract T findById (int id);
    public abstract List<T> findAll ();

}
