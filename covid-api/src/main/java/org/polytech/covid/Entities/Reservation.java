package org.polytech.covid.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
@Table(name = "reservation", schema = "covid")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservation")
    private long idReservation;

    @Column(name = "reservation_date")
    private Date reservationDate;

    @ManyToOne @JoinColumn(name = "center")
    private VaccinationCenter center;

    private String nom;

    private String prenom;

    private String email;


}