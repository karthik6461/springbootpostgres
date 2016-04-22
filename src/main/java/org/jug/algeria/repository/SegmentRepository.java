package org.jug.algeria.repository;

import org.jug.algeria.domain.Asset;
import org.jug.algeria.domain.Segment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface SegmentRepository extends CrudRepository<Segment,Long>{

}
