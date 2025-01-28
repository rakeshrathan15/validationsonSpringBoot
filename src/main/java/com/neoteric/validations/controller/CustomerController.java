package com.neoteric.validations.controller;


import com.neoteric.validations.api.CustomerApi;
import com.neoteric.validations.entity.CustomerEntity;
import com.neoteric.validations.entity.UserEntity;
import com.neoteric.validations.exception.InvalidDetailsException;

import com.neoteric.validations.model.Customer;
import com.neoteric.validations.model.CustomerModel;
import com.neoteric.validations.model.User;
import com.neoteric.validations.repository.CustomerRepository;
import com.neoteric.validations.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class CustomerController  implements CustomerApi {

    @Autowired
     public CustomerService customerService;

    @Autowired
     public CustomerRepository customerRepository;


    @PostMapping("/create")
    public ResponseEntity<CustomerEntity> createUser(@Valid @RequestBody CustomerModel user){
        CustomerEntity userEntity= customerService.saveCustomer(user);


        customerRepository.save(userEntity);
        return ResponseEntity.ok(userEntity);
    }


//    @GetMapping("/get")
//    public ResponseEntity<CustomerEntity> getUser(@PathVariable CustomerModel customerModel){
//
//
//
//    }



//    @Override
//
//    @PostMapping("/createCustomer")
//    public ResponseEntity<Customer> createCustomer(@Valid @RequestBody Customer customer) {
//        // Add your business logic here
//       // Customer customer1= customerService.saveCustomer(customer)
//        return ResponseEntity.ok(customer);
//    }

//    @Override
//    @GetMapping("/getCustomer")
//    public ResponseEntity<Customer> getCustomer() {
//        // Return dummy data or integrate with your service
//        Customer customer = new Customer();
//        customer.setCustomerName("Lokesh");
//        customer.setCustomerEmail("Doe@gmail.com");
//        customer.setCuastomerPhone("7013776567");
//       // customer.setAddress(new Address("b));
//        return ResponseEntity.ok(customer);
//    }








}
