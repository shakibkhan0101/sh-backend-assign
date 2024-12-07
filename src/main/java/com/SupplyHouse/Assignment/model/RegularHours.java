package com.SupplyHouse.Assignment.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "regular_hours")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegularHours{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "reg_days")
    private String day;
    private String openTime;
    private String closeTime;


}
