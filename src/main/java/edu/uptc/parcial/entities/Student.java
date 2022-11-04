package edu.uptc.parcial.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
  
  @Id
  private int id_student;
  private String last_name;
  private String name;
  private Date birthday;
  private String phone;
  
  
}
