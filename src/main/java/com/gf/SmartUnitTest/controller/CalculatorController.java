package com.gf.SmartUnitTest.controller;

import com.gf.SmartUnitTest.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("/")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;


    @GetMapping("/add")
    public int add(@RequestParam("param1") int param1, @RequestParam("param2") int param2) {
        return calculatorService.add(param1, param2);
    }

    @GetMapping("/minus")
    public int minus(@RequestParam("param1") int param1, @RequestParam("param2") int param2) {
        return calculatorService.minus(param1, param2);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam("param1") int param1, @RequestParam("param2") int param2) {
        return calculatorService.multiply(param1, param2);
    }

    @GetMapping("/divide")
    public int divide(@RequestParam("param1") int param1, @RequestParam("param2") int param2) {
        return calculatorService.multiply(param1, param2);
    }

}