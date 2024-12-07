package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderConroller {
	@Autowired
    private OrderService orderService;

    @RequestMapping(value = "")
    public ResponseEntity createOrder(@RequestBody Order order) {
        if (order.getOrderId() == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        Order savedOrder = orderService.saveOrder(order);
        return new ResponseEntity(savedOrder, HttpStatus.CREATED);
    }
}

spring.datasource.url=jdbc/mysql;
spring.datasource.username=root;
spring.datasource.password=0324;
spring.datasource.driver.class name=com.mysql.cj.jdbc.Driver;
spring.jpa.hibernate.ddl_auto=update;
spring.jpa.show_sql=true;

}
}
