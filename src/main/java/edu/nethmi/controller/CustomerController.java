package edu.nethmi.controller;

import edu.nethmi.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/name")
    public String getName(){
        return "Nethmi";
    }

    @GetMapping("/age")
    public Integer getAge(){
        return 18;
    }

    @GetMapping("/get-customer")
    public Customer getCustomer(){
        return  new Customer(
                "C001",
                "Nethmi",
                "Panadura",
                100000.0
        );
    }
}
