package com.inventoryandsalessystem.sales.service;

import com.inventoryandsalessystem.sales.model.Sale;

import java.util.UUID;

public interface SaleServiceI {
    public Sale createSale(Sale Sale);
    public Sale findSaleById(UUID id);
    public boolean deleteSale(UUID id);
}
