package com.example.testspringmysql.dao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testspringmysql.entity.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
   public List<Employee> findAllByOrderByLastNameAsc();
}
