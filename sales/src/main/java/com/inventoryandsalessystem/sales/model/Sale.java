package com.inventoryandsalessystem.sales.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDate date; // localDateTime no funciona porque la version del dbms es antigua
    private Double total;
    @OneToMany(mappedBy = "sale")
    private List<SaleDetail> details;
    private String client;
}

/*
CascadeType: En Sale, agregué CascadeType.ALL en la relación @OneToMany para que las operaciones de
persistencia en Sale se propaguen a SaleDetail.
*/