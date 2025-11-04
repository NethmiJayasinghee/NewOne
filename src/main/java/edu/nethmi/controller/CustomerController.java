package edu.nethmi.controller;

import edu.nethmi.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    List<Customer> customerList=new ArrayList<>();

    @GetMapping("/get-all")

    public List<Customer> getAll(){
        customerList.add(new Customer("C002","Nadun","Kurunegala",75000.0));
        customerList.add(new Customer("C003","Naduni","Gampaha",750000.0));
        customerList.add(new Customer("C004","Nadun","Kurunegala",75000.0));
        customerList.add(new Customer("C005","Nadun","Kurunegala",75000.0));
        return  customerList;
    }

}
