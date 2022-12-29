package com.spring.hibernateadvance.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
// ***** SINGLE TABLE *****
//@DiscriminatorValue(value = "LEARNER")
@Getter
public class Learner extends User {
    private String course;

    @Builder
    public Learner(Integer id, @Size(max = 45) String firstName, @Size(max = 45) String lastName, @Size(max = 45) String email, String course) {
        super(id, firstName, lastName, email);
        this.course = course;
    }
}
