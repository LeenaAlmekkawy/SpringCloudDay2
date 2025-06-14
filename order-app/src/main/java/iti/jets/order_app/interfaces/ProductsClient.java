package iti.jets.order_app.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("product-app")
public interface ProductsClient {
    
    @GetMapping("/products/{id}")
    Object getProductByOrderId(@PathVariable Long id);

}
