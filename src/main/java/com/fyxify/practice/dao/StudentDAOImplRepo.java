package com.fyxify.practice.dao;

import com.fyxify.practice.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImplRepo implements StudentDAO {

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImplRepo(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        this.entityManager.persist(student);
    }

    @Override
    public Student findById(Long id) {
        return this.entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = this.entityManager.createQuery("FROM Student order by name desc", Student.class);
        return query.getResultList();
    }

    @Override
    public List<Student> findByName(String name) {
        TypedQuery<Student> query = this.entityManager.createQuery("FROM Student where name=:sname ", Student.class);
        query.setParameter("sname", name);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Student student = findById(id);
        entityManager.remove(student);
    }
}
