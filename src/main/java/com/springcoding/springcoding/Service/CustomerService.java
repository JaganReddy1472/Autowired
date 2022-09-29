package com.springcoding.springcoding.Service;

import com.springcoding.springcoding.Entity.Customer;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerService {

    private static List<Customer> list=new ArrayList<>();
    static{
        Customer c=new Customer();
        c.setId(100L);
        c.setAge(34L);
        c.setLocation("hyd");
        c.setName("jagan");
        list.add(c);
         c=new Customer();
        c.setId(200L);
        c.setAge(23L);
        c.setLocation("ban");
        c.setName("ohit");
        list.add(c);

         c=new Customer();
        c.setId(300L);
        c.setAge(12L);
        c.setLocation("che");
        c.setName("madh");
        list.add(c);
    }

    public List<Customer> getList(){
        return list;
    }


}
