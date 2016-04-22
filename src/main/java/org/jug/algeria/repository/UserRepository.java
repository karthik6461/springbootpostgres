package org.jug.algeria.repository;

import org.jug.algeria.domain.AppTest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<AppTest,Long>{
}
