package com.example.StudentMangement.dao;

import com.example.StudentMangement.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentDaoImplimentation implements StudentDao{
    private EntityManager entityManager;

    @Autowired
    public StudentDaoImplimentation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Student> findAllRecordsOfStudent() {
      TypedQuery typedQuery= entityManager.createQuery("from Student",Student.class);
      return typedQuery.getResultList();
    }
    @Override
    public Student findStudent(Integer roll_no) {
       return entityManager.find(Student.class,roll_no);
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
