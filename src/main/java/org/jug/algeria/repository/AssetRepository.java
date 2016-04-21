package org.jug.algeria.repository;

import org.jug.algeria.domain.Asset;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends CrudRepository<Asset,Long>{
}
