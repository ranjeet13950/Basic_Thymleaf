package com.ThymleafLearn.Thymleaf_Project.Repository;

import com.ThymleafLearn.Thymleaf_Project.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
