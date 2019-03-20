package com.codecool.calculator.Controller;

import com.codecool.calculator.Service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping(value = "/calculator", method = RequestMethod.GET)
    public String displayMainPage(){
        return "calculator";
    }

    @RequestMapping(value = "/calculator", method = RequestMethod.POST, params = "operation=addition")
    public String handleAddition(HttpServletRequest httpServletRequest, Model model){
        int val1 = Integer.valueOf(httpServletRequest.getParameter("firstValue"));
        int val2 = Integer.valueOf(httpServletRequest.getParameter("secondValue"));
        int result = this.calculatorService.addition(val1, val2);
        model.addAttribute("result", result);
        return "calculator";
    }

    @RequestMapping(value = "/calculator", method = RequestMethod.POST, params = "operation=subtraction")
    public String handleSubtraction(HttpServletRequest httpServletRequest, Model model){
        int val1 = Integer.valueOf(httpServletRequest.getParameter("firstValue"));
        int val2 = Integer.valueOf(httpServletRequest.getParameter("secondValue"));
        int result = this.calculatorService.subtraction(val1, val2);
        model.addAttribute("result", result);
        return "calculator";
    }

    @RequestMapping(value="/calculator", method = RequestMethod.POST, params = "operation=division")
    public String handleDivision(HttpServletRequest httpServletRequest, Model model){
        int val1 = Integer.valueOf(httpServletRequest.getParameter("firstValue"));
        int val2 = Integer.valueOf(httpServletRequest.getParameter("secondValue"));
        int result = this.calculatorService.division(val1, val2);
        model.addAttribute("result", result);
        return "calculator";
    }

    @RequestMapping(value="/calculator", method = RequestMethod.POST, params = "operation=multiplication")
    public String handleMultiplication(HttpServletRequest httpServletRequest, Model model){
        int val1 = Integer.valueOf(httpServletRequest.getParameter("firstValue"));
        int val2 = Integer.valueOf(httpServletRequest.getParameter("secondValue"));
        int result = this.calculatorService.multiplication(val1, val2);
        model.addAttribute("result", result);
        return "calculator";
    }
}
