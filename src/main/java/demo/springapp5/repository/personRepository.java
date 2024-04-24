package demo.springapp5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.springapp5.model.personModel;

@Repository
public interface personRepository extends JpaRepository<personModel,Long>{

}
