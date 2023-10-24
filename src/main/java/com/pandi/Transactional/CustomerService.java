package com.pandi.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {



    @Autowired
    CustomerSaveService customerSaveService;


      Logger logger =   LoggerFactory.getLogger(CustomerService.class);

    @Transactional(propagation = Propagation.REQUIRED)
    public void saveCustomer(){

        for(int i=0;i<9;i++){
           customer customer = new customer();
           customer.setCustomerId(i);
           customer.setCustomerName(String.valueOf(i));
            customerSaveService.saveCustomerrepo(customer);
        }

    }



}
