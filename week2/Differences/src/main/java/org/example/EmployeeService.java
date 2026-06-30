package org.example;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository<Employee> employeeRepository;

    @Transactional
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

}

