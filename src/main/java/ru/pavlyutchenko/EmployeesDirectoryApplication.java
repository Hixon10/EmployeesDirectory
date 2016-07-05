package ru.pavlyutchenko;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.pavlyutchenko.domain.Employee;
import ru.pavlyutchenko.service.EmployeeRepository;

import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class EmployeesDirectoryApplication {


    @Bean
    CommandLineRunner init(EmployeeRepository employeeRepository) {
        return (evt) -> Arrays.asList(
                "1, 1, 2, 3, 4, 3, 5".split(","))
                .forEach(
                        index -> {
                            Employee employee = new Employee("firstName" + index,
                                                            "lastName" + index,
                                                            "middleName" + index,
                                                            LocalDateTime.now(),
                                                            "position" + index);
                            employeeRepository.save(employee);
                        });
    }

	public static void main(String[] args) {
		SpringApplication.run(EmployeesDirectoryApplication.class, args);
	}
}
