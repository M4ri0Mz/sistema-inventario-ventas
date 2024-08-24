package com.inventoryandsalessystem.sales.service;

import com.inventoryandsalessystem.sales.model.Sale;

import java.util.UUID;

public interface SaleDetailServiceI {
    public Sale createSale(Sale Sale);
    public Sale findSaleById(UUID id);
    public boolean deleteSale(UUID id);
}
