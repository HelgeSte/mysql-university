package com.example.mysqluniversity.repo;
import com.example.mysqluniversity.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
