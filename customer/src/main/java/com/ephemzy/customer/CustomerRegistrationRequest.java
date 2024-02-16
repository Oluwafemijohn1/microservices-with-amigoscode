package com.ephemzy.customer;

public record CustomerRegistrationRequest(
        String firstname,
        String lastname,
        String email
) {
}
