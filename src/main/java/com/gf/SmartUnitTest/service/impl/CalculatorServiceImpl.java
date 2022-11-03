package com.gf.SmartUnitTest.service.impl;

import com.gf.SmartUnitTest.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        if(b == 0) {
            System.out.println("0不能做除数");
            return -1;
        }

        return a / b;
    }

}
