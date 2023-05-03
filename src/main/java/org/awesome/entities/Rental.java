package org.awesome.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

import static org.thymeleaf.util.DateUtils.day;

@Entity
public class Rental extends BaseEntity {

    @Id @GeneratedValue
    private Long rentalNo;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="bookId")
    private RentalBook book;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="userNo")
    private User user;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private LocalDate rentDt;

    @Temporal(TemporalType.DATE)
    private LocalDate returnDt;

    @Temporal(TemporalType.DATE)
    private LocalDate realRtDt;
}
