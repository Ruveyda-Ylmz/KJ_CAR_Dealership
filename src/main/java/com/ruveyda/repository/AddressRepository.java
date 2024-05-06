package com.ruveyda.repository;

import com.ruveyda.entity.Address;
import com.ruveyda.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AddressRepository extends JpaRepository<Address,Long> {

}
