package iti.jets.user_app.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="order-app")
public interface OrdersClient {
    
    @GetMapping("/orders/users/{userId}")
    public List<Object> getOrdersByUser(@PathVariable Long userId);

}

