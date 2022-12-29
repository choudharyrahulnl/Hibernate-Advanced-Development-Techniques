package com.spring.hibernateadvance.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@DiscriminatorValue(value = "INSTRUCTOR")
@Getter
public class Instructor extends User {
    private Double salary;

    @Builder
    public Instructor(Integer id, @Size(max = 45) String firstName, @Size(max = 45) String lastName, @Size(max = 45) String email, Double salary) {
        super(id, firstName, lastName, email);
        this.salary = salary;
    }
}
