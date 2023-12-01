package com.example.CrudOperationUsingJPA.dao;

import com.example.CrudOperationUsingJPA.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImplimentation implements StudentDao {
    private EntityManager entityManager;
    @Autowired
    public StudentDaoImplimentation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public String insertData(Student student) {
        entityManager.persist(student);
        return "Successfully insert record.";
    }

    @Override
    public Student updateRecord(Student student) {
        return entityManager.merge(student);
    }

    @Override
    public String deleteStudentRecord(Integer roll_no) {
        Student student= entityManager.find(Student.class,roll_no);
        entityManager.remove(student);
        return "Delete record successfully.";
    }
}
