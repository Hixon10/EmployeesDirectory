package ru.pavlyutchenko.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;


@Entity
public class Employee {

    public Employee(String firstName, String lastName, String middleName, LocalDateTime createdDate, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.createdDate = createdDate;
        this.position = position;
    }

    private Employee() {}

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Size(min=3)
    @Column(nullable = false)
    private String firstName;

    @NotNull
    @Size(min=3)
    @Column(nullable = false)
    private String lastName;

    @NotNull
    @Size(min=3)
    @Column(nullable = false)
    private String middleName;

    @NotNull
    @Column(nullable = false)
    private LocalDateTime createdDate;

//    Тут можно вообще делать ещё 1 таблицу с позициями, но не ясно,
//    надо ли это для тестового задания.
    @NotNull
    @Size(min=3)
    @Column(nullable = false)
    private String position;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public String getPosition() {
        return position;
    }

    public Long getId() {
        return id;
    }
}
