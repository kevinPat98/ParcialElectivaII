package edu.uptc.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.uptc.parcial.entities.student_has_matter;

@Repository
public interface relacionRepository extends JpaRepository<student_has_matter, Integer>{
  
}
