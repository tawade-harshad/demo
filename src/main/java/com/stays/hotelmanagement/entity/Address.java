package com.stays.hotelmanagement.entity;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;

    @Column(nullable = false)
    private String addressBldgFlat;

    @Column(nullable = false)
    private String addressStreet;

    @Column(nullable = false)
    private String addressCity;

    @Column(nullable = false)
    private String addressState;

    @Column(nullable = false)
    private String addressPincode;

}
