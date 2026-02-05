package com.example.demo.entity;


import java.math.BigDecimal;
import jakarta.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
@SequenceGenerator(
        name = "emp_seq",
        sequenceName = "EMP_SEQ",
        allocationSize = 1
)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "EMAIL", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "DEPARTMENT", length = 100)
    private String department;

    @Column(name = "SALARY", nullable = false, precision = 10, scale = 2)
    private BigDecimal salary;


    // ===== Constructors =====

    public Employee() {
        // default constructor required by JPA
    }

    public Employee(String name, String email, String department, BigDecimal salary) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }

    // ===== Getters & Setters =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}