package com.example.payroll.api.controller.order;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) { super("Could not find order " + id); }
}
