package com.neoteric.validations.model;

public class ErrorDetails {

    private String status;

    private String details;

    public ErrorDetails(){


    }

    public ErrorDetails(String status, String details) {
        this.status = status;
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;


    }
}
