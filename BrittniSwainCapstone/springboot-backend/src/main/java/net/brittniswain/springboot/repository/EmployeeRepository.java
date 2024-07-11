package net.brittniswain.springboot.repository;

import net.brittniswain.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
    //all crud database methods
}
