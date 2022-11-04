package edu.uptc.parcial.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uptc.parcial.entities.Matter;
import edu.uptc.parcial.repositories.MatterRepository;

@Service
public class MatterService {
  
  @Autowired
  private MatterRepository MatterRepository;

  public List<Matter> allMatters(){
    return MatterRepository.findAll();
  }

  public Matter addMatter(Matter Matters){
    return MatterRepository.existsById(Matters.getCode()) ? null : MatterRepository.save(Matters);
  }

  public Matter delete(String id){
    Matter deleteMatter = findById(id);
    if(deleteMatter!=null){
      MatterRepository.delete(deleteMatter);
    }
    return  deleteMatter;
  }

  public Matter updateMatter(Matter Matters){
    return MatterRepository.existsById(Matters.getCode()) ?MatterRepository.save(Matters) : null;
  }

  public Matter findById(String id){
    return MatterRepository.findById(id).get();
  }
}
