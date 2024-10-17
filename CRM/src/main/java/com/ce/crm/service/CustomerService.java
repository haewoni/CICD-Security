package com.ce.crm.service;

import com.ce.crm.model.Customer;
import com.ce.crm.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer addCustomer(Customer customer) {
        // 입력 검증 없이 추가 (취약점 유발)
        return customerRepository.save(customer);
    }
}
