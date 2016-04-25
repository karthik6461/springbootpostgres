package org.jug.algeria.repository;

import org.jug.algeria.domain.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends CrudRepository<Student,Long>{

}
