package bm.bladmanagement.controllers;

import bm.bladmanagement.services.IOrderService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private IOrderService orderService;

    public OrderController(IOrderService orderService){
        this.orderService = orderService;
    }
}
