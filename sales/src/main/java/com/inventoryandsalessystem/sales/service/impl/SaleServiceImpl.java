package com.inventoryandsalessystem.sales.service.impl;

import com.inventoryandsalessystem.sales.model.Sale;
import com.inventoryandsalessystem.sales.service.SaleServiceI;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Getter @Setter
public class SaleServiceImpl implements SaleServiceI {
    //private final SaleServiceI saleServiceI;
    @Override
    public Sale createSale(Sale Sale) {
        return null;
    }

    @Override
    public Sale findSaleById(UUID id) {
        return null;
    }

    @Override
    public boolean deleteSale(UUID id) {
        return false;
    }
}
