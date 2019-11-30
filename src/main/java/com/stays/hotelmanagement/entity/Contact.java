package com.stays.hotelmanagement.entity;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="HBMS_CONTACT")
public class Contact {

    @Id
    @Column(name="CONTACT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int contactId;

    @Column(name="MOBILE_NO" , nullable = false)
    private String mobileNo;

    @Column(name="PRIMARY_PHONE")
    private String primaryPhone;

    @Column(name="SECONDARY_PHONE")
    private String secondaryPhone;

    /*@ManyToOne(targetEntity = Users.class)
    @JoinColumn(name="CONTACT_ID", nullable = false)
    private Users users;*/
}
