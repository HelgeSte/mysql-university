package com.example.mysqluniversity.repo;
import com.example.mysqluniversity.domain.Student;
import org.springframework.data.repository.CrudRepository;

// CRUD = create, read, update and delete
// Inherits the create, read, update and delete methods from the CrudRepository class
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
