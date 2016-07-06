package ru.pavlyutchenko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.pavlyutchenko.domain.Employee;
import ru.pavlyutchenko.service.EmployeeRepository;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/")
public class EmployeesController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}
