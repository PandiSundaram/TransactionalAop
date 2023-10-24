package com.pandi.Transactional;

import com.pandi.Transactional.CustomerRepository;
import com.pandi.Transactional.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerSaveService {

    @Autowired
    CustomerRepository customerRepository;

    @Transactional(propagation = Propagation.MANDATORY)
    public void saveCustomerrepo(customer customer){

        if(customer.getCustomerId() == 10){
            throw new NullPointerException();
            // all the saved transaction will be rolle it back if exeception occurs in the middle
            // if we are not specifying the @transactional, few information will be stored and few not
        }


        customerRepository.save(customer);
    }



}
