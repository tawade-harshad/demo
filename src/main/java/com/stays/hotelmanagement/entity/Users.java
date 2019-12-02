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

    @Column(name="EMAIL" , nullable = false)
    private String email;

    @Column(name="WORK_LOCATION", nullable = false)
    private String workLocation;

    @OneToMany(mappedBy = "Users", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    /*@JoinColumn(referencedColumnName = "ADDRESS_ID", nullable = false)*/
    private Set<Address> addresses;

    @OneToMany(mappedBy = "Users", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    /*@JoinColumns(name= nullable = false)*/
    private Set<Contact> contacts;

    public enum Roles {
        ADMIN, EMPLOYEE, USER
    }

}
