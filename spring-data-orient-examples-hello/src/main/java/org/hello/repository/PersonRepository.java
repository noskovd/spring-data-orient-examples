package org.hello.repository;

import java.util.List;

import org.hello.data.Person;
import org.springframework.data.orient.object.repository.OrientObjectRepository;
import org.springframework.data.orient.repository.annotation.Query;

public interface PersonRepository extends OrientObjectRepository<Person> {
    
    List<Person> findByFirstName(String firstName);
    
    @Query("select from person where lastName = ?")
    List<Person> findByLastName(String lastName);
    
    List<Person> findByAge(Integer age);
}
