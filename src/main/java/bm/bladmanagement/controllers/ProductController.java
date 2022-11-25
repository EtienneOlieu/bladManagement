package bm.bladmanagement.controllers;

import bm.bladmanagement.services.IProductService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private IProductService productService;

    public ProductController(IProductService productService){
        this.productService = productService;
    }
}
