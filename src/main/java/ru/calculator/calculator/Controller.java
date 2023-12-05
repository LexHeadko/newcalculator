package ru.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final Service service;

    private Controller(Service service) {
        this.service = service;
    }

    @GetMapping
    public String hello() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam double num1, @RequestParam double num2) {
        return service.printPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return service.printMinus(num1, num2);
    }

    @GetMapping(path = "/multi")
    public String multiplication(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return service.printMultiplication(num1, num2);
    }

    @GetMapping(path = "/division")
    public String division(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return service.printDivision(num1, num2);
    }

}
