package edu.uptc.parcial.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import edu.uptc.parcial.entities.Matter;
import edu.uptc.parcial.entities.Student;
import edu.uptc.parcial.entities.student_has_matter;
import edu.uptc.parcial.services.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
  
  @Autowired
  private StudentService studentService;

  @PostMapping()
  public Student postStudent(@RequestBody Student student){
    return studentService.addStudent(student);
  }

  @GetMapping()
  public List<Student> getStudent(){
    return studentService.allStudents();
  }

  @PutMapping()
  public Student updateStudent(@RequestBody Student student){
    return studentService.updateStudent(student);
  }

  @DeleteMapping("/{id}")
  public Student deleteStudent(@PathVariable(value = "id") int id){
    return studentService.delete(id);
  }

  @GetMapping("/{id}")
  public Student getStudent(@PathVariable(value = "id") int id){
    return studentService.findById(id);
  }

  @PostMapping("/{id}/matter/{idMatter}")
  public student_has_matter addMatter(@PathVariable (value = "id") int id, @PathVariable (value = "idMatter") String idMatter){
    return studentService.addMatter(id, idMatter);
  }

  @GetMapping("/matter/{id}")
  public List<Matter> getMateria(@PathVariable (value = "id") int id){
    return studentService.listMatter(id);
  }
}
