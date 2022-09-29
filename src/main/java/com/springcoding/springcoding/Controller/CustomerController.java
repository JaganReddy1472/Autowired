package com.springcoding.springcoding.Controller;

import com.springcoding.springcoding.Entity.Customer;
import com.springcoding.springcoding.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class CustomerController {

    @Autowired
    CustomerService service;

    @GetMapping("/users")
    public List<Customer> getList(){
        return service.getList();
    }

}
