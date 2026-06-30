package org.example;

public interface EmployeeRepository<Employee>
    extends JpaRepository<Employee, Long> {
}
