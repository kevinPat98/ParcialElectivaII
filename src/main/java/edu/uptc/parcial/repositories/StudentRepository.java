package edu.uptc.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.uptc.parcial.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
  
}
