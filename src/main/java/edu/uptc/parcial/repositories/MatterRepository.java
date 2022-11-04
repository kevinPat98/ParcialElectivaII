package edu.uptc.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.uptc.parcial.entities.Matter;

@Repository
public interface MatterRepository extends JpaRepository<Matter, String>{
  
}
