package org.jug.algeria.domain;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "subjects")
public class Subject {
 
  @Id
  @GeneratedValue
  private long id;
  
  @Column(name = "name", nullable = false)
  private String name = "";
 
  public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Set<Student> getStudents() {
	return students;
}

public void setStudents(Set<Student> students) {
	this.students = students;
}

@ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "students_subjects",
    joinColumns = @JoinColumn(name = "subject_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"))
  private Set<Student> students = new HashSet<Student>();
 
  /* getters, setters, equals & hashCode */
}