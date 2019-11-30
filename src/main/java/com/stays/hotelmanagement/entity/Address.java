package com.stays.hotelmanagement.entity;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="HBMS_ADDRESS")
public class Address {

    @Id
    @Column(name="ADDRESS_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;

    @Column(name="ADD_BLDG_FLAT", nullable = false)
    private String addressBldgFlat;

    @Column(name="ADD_STREET" , nullable = false)
    private String addressStreet;

    @Column(name="ADD_CITY" , nullable = false)
    private String addressCity;

    @Column(name="ADD_STATE" , nullable = false)
    private String addressState;

    @Column(name="ADD_PINCODE" , nullable = false)
    private String addressPincode;

    /*@ManyToOne(targetEntity = Users.class)
    @JoinColumn(name="ADDRESS_ID", nullable = false)
    private Users users;*/

}
