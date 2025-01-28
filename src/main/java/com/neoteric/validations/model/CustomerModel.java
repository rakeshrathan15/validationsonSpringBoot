package com.neoteric.validations.model;

import jakarta.validation.constraints.NotBlank;

public class CustomerModel {


    @NotBlank(message = "Customer Name is Required")
    private String customerName;
    private String customerEmail;

    private String cuastomerPhone;

    private AddressModel addressModel;

    public CustomerModel(){

    }

    public CustomerModel(String customerName, String customerEmail, String cuastomerPhone, AddressModel addressModel) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.cuastomerPhone = cuastomerPhone;
        this.addressModel = addressModel;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCuastomerPhone() {
        return cuastomerPhone;
    }

    public void setCuastomerPhone(String cuastomerPhone) {
        this.cuastomerPhone = cuastomerPhone;
    }

    public AddressModel getAddressModel() {
        return addressModel;
    }

    public void setAddressModel(AddressModel addressModel) {
        this.addressModel = addressModel;
    }
}
