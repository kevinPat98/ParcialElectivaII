package edu.uptc.parcial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uptc.parcial.entities.Matter;
import edu.uptc.parcial.services.MatterService;

@RestController
@RequestMapping(value = "/matter")
public class MatterController {
 
  @Autowired
  private MatterService MatterService;

  @PostMapping()
  public Matter postMatter(@RequestBody Matter Matter){
    return MatterService.addMatter(Matter);
  }

  @GetMapping()
  public List<Matter> getMatter(){
    return MatterService.allMatters();
  }

  @PutMapping()
  public Matter updateMatter(@RequestBody Matter Matter){
    return MatterService.updateMatter(Matter);
  }

  @DeleteMapping("/{id}")
  public Matter deleteMatter(@PathVariable(value = "id") String id){
    return MatterService.delete(id);
  }

  @GetMapping("/{id}")
  public Matter getMatter(@PathVariable(value = "id") String id){
    return MatterService.findById(id);
  }
}
