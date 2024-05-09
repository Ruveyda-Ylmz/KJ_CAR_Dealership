package com.ruveyda.controller;

import com.ruveyda.dto.request.OrderRequestDto;
import com.ruveyda.entity.ElectricCar;
import com.ruveyda.entity.Order;
import com.ruveyda.entity.superclasses.Car;
import com.ruveyda.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> newOrder(@RequestBody @Valid OrderRequestDto dto){
    return ResponseEntity.ok(orderService.newOrder(dto));
    }


}
