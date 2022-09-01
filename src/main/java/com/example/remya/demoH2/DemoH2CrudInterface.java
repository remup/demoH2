package com.example.remya.demoH2;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoH2CrudInterface extends CrudRepository<DemoH2Entity, Serializable> {
    @Query(value="select *from DemoH2Entity where name=:name ",nativeQuery=true)
	List<DemoH2Entity> findByName(@Param("name") String name);
}
