package ru.pavlyutchenko;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.pavlyutchenko.domain.Employee;
import ru.pavlyutchenko.service.EmployeeRepository;

import java.time.LocalDateTime;

@SpringBootApplication
public class EmployeesDirectoryApplication {

    @Bean
    CommandLineRunner init(EmployeeRepository employeeRepository) {
        return (evt) -> {
            Employee employee = new Employee("Иван", "Петров", "Игорьевич", LocalDateTime.of(1982, 1, 3, 3, 5), "Сторож");
            employeeRepository.save(employee);

            employee = new Employee("Иван", "Сирдюк", "Игорьевич", LocalDateTime.of(1982, 5, 9, 3, 5), "Сторож");
            employeeRepository.save(employee);

            employee = new Employee("Иван", "Носов", "Анатольевич", LocalDateTime.of(1986, 5, 24, 3, 5), "Прораб");
            employeeRepository.save(employee);

            employee = new Employee("Андрей", "Никитин", "Андреевич", LocalDateTime.of(1993, 6, 21, 3, 5), "Сантехник");
            employeeRepository.save(employee);

            employee = new Employee("Сергей", "Веснушкин", "Сергеевич", LocalDateTime.of(1987, 2, 25, 3, 5), "Водитель");
            employeeRepository.save(employee);

            employee = new Employee("Афанасий", "Киров", "Алексеевич", LocalDateTime.of(1981, 8, 13, 3, 5), "Писатель");
            employeeRepository.save(employee);

            employee = new Employee("Елена", "Макоренко", "Денисович", LocalDateTime.of(1987, 12, 22, 3, 5), "Программист");
            employeeRepository.save(employee);

            employee = new Employee("Иван2", "Сирдюк", "Игорьевич", LocalDateTime.of(1982, 5, 9, 3, 5), "Сторож");
            employeeRepository.save(employee);

            employee = new Employee("Иван2", "Носов", "Анатольевич", LocalDateTime.of(1986, 5, 24, 3, 5), "Прораб");
            employeeRepository.save(employee);

            employee = new Employee("Андрей2", "Никитин", "Андреевич", LocalDateTime.of(1993, 6, 21, 3, 5), "Сантехник");
            employeeRepository.save(employee);

            employee = new Employee("Сергей2", "Веснушкин", "Сергеевич", LocalDateTime.of(1987, 2, 25, 3, 5), "Водитель");
            employeeRepository.save(employee);

            employee = new Employee("Афанасий2", "Киров", "Алексеевич", LocalDateTime.of(1981, 8, 13, 3, 5), "Писатель");
            employeeRepository.save(employee);

            employee = new Employee("Елена2", "Макоренко", "Денисович", LocalDateTime.of(1987, 12, 22, 3, 5), "Программист");
            employeeRepository.save(employee);
        };
    }

	public static void main(String[] args) {
		SpringApplication.run(EmployeesDirectoryApplication.class, args);
	}
}
