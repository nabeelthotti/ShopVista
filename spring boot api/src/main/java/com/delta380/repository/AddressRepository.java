package com.delta380.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delta380.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
