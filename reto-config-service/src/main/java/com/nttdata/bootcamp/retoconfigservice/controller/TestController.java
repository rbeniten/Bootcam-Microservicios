package com.nttdata.bootcamp.retoconfigservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${product.product-name}")
    private String myProductName;
	
	@Value("${product.product-price}")
    private String myProductPrice;
    
    @GetMapping(path="/getProductName")
    public String myProduct() {
   	 return this.myProductName + this.myProductPrice;
    }

}
