package iti.jets.order_app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iti.jets.order_app.dto.OrderDto;
import iti.jets.order_app.dto.ProductDto;
import iti.jets.order_app.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    
    @PostMapping
    public ResponseEntity<OrderDto> createOrder(@RequestBody OrderDto dto) {
        return ResponseEntity.ok(orderService.createOrder(dto));
    }
    
   
    @GetMapping("/{id}")
    public ResponseEntity<OrderDto> getOrder(@PathVariable Long id) {
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

  
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<OrderDto>> getOrdersByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(orderService.getOrdersByUser(userId));
    }

   
    @GetMapping("/{orderId}/product")
    public ResponseEntity<Object> getProductByOrder(@PathVariable Long orderId) {
        return ResponseEntity.ok(orderService.getProductByOrderIdFeignClient(orderId));
    }
}
