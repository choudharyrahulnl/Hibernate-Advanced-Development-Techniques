package com.spring.hibernateadvance.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.*;

@Entity
@Table(name = "student")
@Setter
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString(of = {"id","firstName","lastName","email"})
@EqualsAndHashCode(of = {"id", "email"})
public class Student {
    @Id
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

    // SET
//    @ElementCollection
//    @CollectionTable(name = "image", joinColumns = @JoinColumn(name = "student_id"))
//    @Column(name = "file_name")
//    private Set<String> images = new HashSet<>();

    // LIST
//    @ElementCollection
//    @CollectionTable(name = "image")
//    @OrderColumn // default name is <property>_ORDER
//    @Column(name = "file_name")
//    private List<String> images = new ArrayList<>();


    // MAP
//    @ElementCollection
//    @CollectionTable(name = "image")
//    @MapKeyColumn(name = "image_name") // default name is <property>_KEY
//    @Column(name = "image_description")
//    private Map<String,String> images = new HashMap<>();

    // SORTED SET
//    @ElementCollection
//    @CollectionTable(name = "image")
//    @OrderBy("file_name DESC") // default name is <property>_KEY
//    @Column(name = "file_name")
//    private Set<String> images = new LinkedHashSet<>();

    // SORTED MAP
    @ElementCollection
    @CollectionTable(name = "image")
    @MapKeyColumn(name = "image_name") // default name is <property>_KEY
    @OrderBy("image_name DESC") // default name is <property>_KEY
    @Column(name = "image_description")
    private Map<String,String> images = new LinkedHashMap<>();


}