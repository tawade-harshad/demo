package com.stays.hotelmanagement.entity;

import lombok.*;
import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="HBMS_USERS")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;

    @Column(nullable = false, unique = true)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Roles role;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String workLocation;

    @Embedded
    private Address addresses;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="userId")
    private Set<Bookings> bookings;

    public enum Roles {
        ADMIN, EMPLOYEE, USER
    }

}
