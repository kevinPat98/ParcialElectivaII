package edu.uptc.parcial.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uptc.parcial.entities.Matter;
import edu.uptc.parcial.entities.Student;
import edu.uptc.parcial.entities.student_has_matter;
import edu.uptc.parcial.repositories.MatterRepository;
import edu.uptc.parcial.repositories.StudentRepository;
import edu.uptc.parcial.repositories.relacionRepository;

@Service
public class StudentService {
  
  @Autowired
  private StudentRepository studentRepository;

  @Autowired
  private  relacionRepository relacionRepository;

  @Autowired
  private MatterRepository matterRepository;

  public List<Student> allStudents(){
    return studentRepository.findAll();
  }

  public Student addStudent(Student students){
    return studentRepository.existsById(students.getId_student()) ? null : studentRepository.save(students);
  }

  public Student delete(int id){
    Student deleteStudent = findById(id);
    if(deleteStudent!=null){
      studentRepository.delete(deleteStudent);
    }
    return  deleteStudent;
  }

  public Student updateStudent(Student students){
    return studentRepository.existsById(students.getId_student()) ?studentRepository.save(students) : null;
  }

  public Student findById(int id){
    return studentRepository.findById(id).get();
  }

  public student_has_matter addMatter(int id, String idMatter){
    try {
      student_has_matter studentHasMatter = new student_has_matter();
      studentHasMatter.setStuden_id_student(findById(id));
      studentHasMatter.setMatter_code(matterRepository.findById(idMatter).get());
      return relacionRepository.save(studentHasMatter);
    } catch (Exception e) {
      return null;
    }
  }

  public List<Matter> listMatter(int id){
    ArrayList<Matter> materias = new ArrayList<>();
    ArrayList<student_has_matter> lista = (ArrayList<student_has_matter>) relacionRepository.findAll();
    for (int i = 0; i < lista.size(); i++) {
      if(id == lista.get(i).getStuden_id_student().getId_student()){
        materias.add(lista.get(i).getMatter_code());
      }
    }
    return materias;
  }

}
