package com.example.payroll.resources.database;

import com.example.payroll.model.employee.Employee;
import com.example.payroll.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                log.info("Preloading " + employeeRepository.save(new Employee("Frodo", "Baggins", "burglar")));
                log.info("Preloading " + employeeRepository.save(new Employee("Bilbo", "Baggins", "thief")));
            }
        };
    }
}
