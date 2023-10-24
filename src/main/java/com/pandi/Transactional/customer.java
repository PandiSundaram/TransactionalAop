package com.pandi.Transactional;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class customer {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    private String customerName;


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }




}
