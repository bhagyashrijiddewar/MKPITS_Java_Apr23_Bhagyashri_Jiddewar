package com.example.StudentMangement.dao;

import com.example.StudentMangement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDao extends JpaRepository<Student,Integer> {

}
