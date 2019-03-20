package com.codecool.calculator.Service;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public int addition(Integer val1, Integer val2){
        return val1 + val2;
    }

    public int subtraction(Integer val1, Integer val2){
        return val1 - val2;
    }

    public int division(Integer val1, Integer val2){
        return val1 / val2;
    }

    public int multiplication(Integer val1, Integer val2){
        return val1 * val2;
    }

}
