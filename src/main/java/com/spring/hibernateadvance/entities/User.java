package com.spring.hibernateadvance.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Table(name = "user")
@Getter
@AllArgsConstructor
// ***** SINGLE TABLE *****
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="USER_TYPE", discriminatorType=DiscriminatorType.STRING)
// *****  TABLE PER CLASS *****
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
// *****  JOINED TABLE *****
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    // ***** SINGLE TABLE *****
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    // *****  TABLE PER CLASS *****
    //@GeneratedValue(strategy = GenerationType.TABLE)
    // *****  JOINED TABLE *****
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(name = "first_name", length = 45)
    private String firstName;

    @Size(max = 45)
    @Column(name = "last_name", length = 45)
    private String lastName;

    @Size(max = 45)
    @Column(name = "email", length = 45, unique = true)
    private String email;

}
