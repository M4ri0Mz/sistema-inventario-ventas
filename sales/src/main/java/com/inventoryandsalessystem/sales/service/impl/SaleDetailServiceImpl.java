package com.inventoryandsalessystem.sales.service.impl;

import com.inventoryandsalessystem.sales.dao.SaleRepository;
import com.inventoryandsalessystem.sales.model.Sale;
import com.inventoryandsalessystem.sales.model.SaleDetail;
import com.inventoryandsalessystem.sales.service.SaleDetailServiceI;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@RequiredArgsConstructor
@Getter @Setter
public class SaleDetailServiceImpl implements SaleDetailServiceI {
    //private final SaleDetailServiceI saleDetailServiceI;
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
