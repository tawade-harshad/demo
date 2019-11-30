package com.example.demo.entity;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="HBMS_USERS")
public class Users {

    @Id
    @Column(name="USER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;

    @Column(name="USER_NAME", nullable = false, unique = true)
    private String userName;

    @Column(name="PASSWORD", nullable = false)
    private String password;

    @Column(name="FULL_NAME", nullable = false)
    private String fullName;

    @Column(name="ROLE", nullable = false)
    @Enumerated(EnumType.STRING)
    private Roles role;

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

    @Column(name="MOBILE_NO" , nullable = false)
    private String mobileNo;

    @Column(name="PRIMARY_PHONE")
    private String primaryPhone;

    @Column(name="SECONDARY_PHONE")
    private String secondaryPhone;

    @Column(name="EMAIL" , nullable = false)
    private String email;

    @Column(name="WORK_LOCATION" , nullable = false)
    private String workLocation;

    public enum Roles {
        ADMIN, EMPLOYEE, USER
    }

}
