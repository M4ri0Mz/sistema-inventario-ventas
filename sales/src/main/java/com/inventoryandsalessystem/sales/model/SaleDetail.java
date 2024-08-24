package com.inventoryandsalessystem.sales.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SaleDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @OneToOne
    @JoinColumn(name = "product_id",
            referencedColumnName = "id")
    private Product product;
    private Integer units;
    private Double unitPrice;
    private Double subTotal;
    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale sale;
}
