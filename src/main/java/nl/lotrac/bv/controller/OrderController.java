package nl.lotrac.bv.controller;


import nl.lotrac.bv.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge=3600)
@RestController
@RequestMapping(value = "/orders")



public class OrderController {

@Autowired
    private OrderService orderService;


@GetMapping(value="")
    public ResponseEntity<Object>getOrders(){

    return ResponseEntity.ok().body(orderService.getOrders());
}



}
