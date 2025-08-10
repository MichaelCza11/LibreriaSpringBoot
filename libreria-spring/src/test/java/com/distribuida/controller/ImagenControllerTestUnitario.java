package com.distribuida.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImagenControllerTestUnitario {
    @GetMapping("/api/test")
    public String test() {
        return "API funcionando";
    }
}
