package bm.bladmanagement.controllers;

import bm.bladmanagement.services.IStockService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    private IStockService stockService;

    public StockController(IStockService stockService){
        this.stockService = stockService;
    }
}
