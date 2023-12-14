package com.example.StudentMangement.repository;

import com.example.StudentMangement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer> {

}
