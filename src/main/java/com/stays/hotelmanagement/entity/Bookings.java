package com.stays.hotelmanagement.entity;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="HBMS_BOOKING_DETAILS")
public class Bookings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String bookingId;

    @Column(nullable = false, columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private Date bookedFromDate;

    @Column(nullable = false, columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private Date bookedToDate;

    @Column(nullable = false, columnDefinition = "INT DEFAULT 1")
    private int daysBooked;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkInDateTime;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkOutDateTime;

    @Column(nullable = false, precision = 10, scale = 2, columnDefinition = "FLOAT DEFAULT 0.0")
    private double bookingAmount;

    @Column(nullable = false, columnDefinition = "INT DEFAULT 1")
    private int noOfAdults;

    @Column(nullable = false, columnDefinition = "INT DEFAULT 0")
    private int noOfChildrens;

    @Column(nullable = false)
    private String bookedBy;

    @Column(nullable = false)
    private String bookingStatus;

    @Column(nullable = false)
    private String hotelId;

    @Column(nullable = false)
    private String roomId;
}
