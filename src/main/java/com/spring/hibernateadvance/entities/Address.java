package com.spring.hibernateadvance.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    /**
     * It's a Value Type (BASIC, EMBEDDED**, COLLECTION) so no identifier (@Id)
     */

    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "zipcode")
    private String zipcode;
}
