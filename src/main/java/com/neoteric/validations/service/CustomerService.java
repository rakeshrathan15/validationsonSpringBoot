package com.neoteric.validations.service;

import com.neoteric.validations.entity.AddressEntity;
import com.neoteric.validations.entity.CustomerEntity;
import com.neoteric.validations.entity.NomineeEntity;
import com.neoteric.validations.entity.UserEntity;
import com.neoteric.validations.model.AddressModel;

import com.neoteric.validations.model.CustomerModel;
import com.neoteric.validations.model.User;
import com.neoteric.validations.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    public CustomerRepository customerRepository;



    public CustomerEntity saveCustomer(CustomerModel user){


        AddressEntity userAddress = mapToAddressEntity1(user.getAddressModel());
       // AddressEntity nomineeAddress= mapToAddressEntity1(user.getNominee().getAddress());

//        NomineeEntity nomineeEntity= new NomineeEntity();
//        nomineeEntity.setNomineeName(user.getNominee().getNomineeName());
//        nomineeEntity.setNomineeRelation(user.getNominee().getRelation());
//        nomineeEntity.setAddressEntity(nomineeAddress);


        CustomerEntity userEntity= new CustomerEntity();
        userEntity.setCustomerName(user.getCustomerName());
        userEntity.setCustomerEmail(user.getCustomerEmail());
        userEntity.setCustomerPhone(user.getCuastomerPhone());
        userEntity.setAddress(userAddress);
       // userEntity.set(nomineeEntity);

        return userEntity;
    }


    public AddressEntity mapToAddressEntity1(AddressModel address){
        AddressEntity addressEntity= new AddressEntity();
        addressEntity.setStreet(address.getStreet());
        addressEntity.setCity(address.getCity());
        addressEntity.setState(address.getState());
        addressEntity.setPincode(address.getPincode());
        return addressEntity;
    }











}
