package com.ephemzy.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(
        CustomerRepository customerRepository
) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstname(request.firstname())
                .lastname(request.lastname())
                .email(request.email())
                .build();

        //todo: check iof the email is valid
        //todo: check iof the token is valid
        //todo: store customer in DB
        customerRepository.save(customer);
    }
}
