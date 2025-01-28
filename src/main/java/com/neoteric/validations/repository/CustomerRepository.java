package com.neoteric.validations.repository;

import com.neoteric.validations.entity.CustomerEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository<CustomerEntity,Long> {



}
