package com.spring.hibernateadvance.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Table(name = "image")
@Setter
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString(of = {"studentId","fileName"})
@EqualsAndHashCode(of = {"studentId", "fileName"})
public class Image {
    @NotNull
    @Column(name = "student_id", nullable = false)
    private Integer studentId;

    @Size(max = 45)
    @Column(name = "file_name", length = 45)
    private String fileName;

}