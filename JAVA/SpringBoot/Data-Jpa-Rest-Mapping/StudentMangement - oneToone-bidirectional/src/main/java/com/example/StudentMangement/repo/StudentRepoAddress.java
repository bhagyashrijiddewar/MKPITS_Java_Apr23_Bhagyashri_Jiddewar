package com.example.StudentMangement.repo;
import com.example.StudentMangement.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepoAddress extends JpaRepository<Address,Integer> {
}
