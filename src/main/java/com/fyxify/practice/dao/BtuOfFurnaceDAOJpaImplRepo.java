package com.fyxify.practice.dao;

import com.fyxify.practice.entity.BtuOfFurnace;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BtuOfFurnaceDAOJpaImplRepo implements BtuOfFurnaceDAO {

    private EntityManager entityManager;

    @Autowired
    public BtuOfFurnaceDAOJpaImplRepo(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<BtuOfFurnace> findAll() {
        TypedQuery<BtuOfFurnace> query = entityManager.createQuery("From BtuOfFurnace", BtuOfFurnace.class);
        List<BtuOfFurnace> btuOfFurnaces = query.getResultList();
        return btuOfFurnaces;
    }

    @Override
    public BtuOfFurnace findById(long id) {
        return entityManager.find(BtuOfFurnace.class, id);
    }

    @Override
    public BtuOfFurnace upsert(BtuOfFurnace btuOfFurnace) {
        return entityManager.merge(btuOfFurnace);
    }

    @Override
    public void delete(long id) {
        BtuOfFurnace btuOfFurnace = findById(id);
        entityManager.remove(btuOfFurnace);
    }
}
