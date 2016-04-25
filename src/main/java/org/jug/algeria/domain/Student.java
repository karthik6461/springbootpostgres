package org.jug.algeria.domain;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "students")
public class Student {
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

public Set<Subject> getSubjects() {
	return subjects;
}

public void setSubjects(Set<Subject> subjects) {
	this.subjects = subjects;
}

@ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "students_subjects",
    joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "subject_id", referencedColumnName = "id"))
  private Set<Subject> subjects = new HashSet<Subject>();
 
  /* getters, setters, equals & hashCode */
}
