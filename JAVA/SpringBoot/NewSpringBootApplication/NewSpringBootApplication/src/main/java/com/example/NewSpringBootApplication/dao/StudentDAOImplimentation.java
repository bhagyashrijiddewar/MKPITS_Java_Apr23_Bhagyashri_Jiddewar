package com.example.NewSpringBootApplication.dao;

import com.example.NewSpringBootApplication.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImplimentation implements StudentDAO{
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImplimentation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }
    @Override
    public Student findByRollNo(Integer rollNo) {
        return entityManager.find(Student.class,rollNo);
    }

    @Override
    public List<Student> findAllStudent(Student student) {


        return null;
    }

    @Override
    @Transactional
    public void deleteRecord(Integer rollno) {
        Student student=entityManager.find(Student.class,rollno);
        entityManager.remove(student);
        System.out.println("Delete successfully");
    }
    @Override
    @Transactional
    public Student updateRecord(Student student) {
        return entityManager.merge(student);
    }
}
