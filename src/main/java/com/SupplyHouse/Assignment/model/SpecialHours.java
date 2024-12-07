package com.SupplyHouse.Assignment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "special_hours")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpecialHours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private String openTime;
    private String closeTime;
    private String message;
}