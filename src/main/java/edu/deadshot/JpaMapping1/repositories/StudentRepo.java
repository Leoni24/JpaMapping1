package edu.deadshot.JpaMapping1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.deadshot.JpaMapping1.models.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {
    List<Student> findAll();    
}
