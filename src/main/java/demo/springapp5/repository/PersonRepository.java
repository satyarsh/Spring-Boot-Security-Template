package demo.springapp5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.springapp5.model.PersonModel;

@Repository
public interface PersonRepository extends JpaRepository<PersonModel,Long>{

}
