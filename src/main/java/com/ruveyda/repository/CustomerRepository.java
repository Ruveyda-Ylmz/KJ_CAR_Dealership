package com.ruveyda.repository;

import com.ruveyda.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Optional<Customer> findOptionalByCustomerCitizenshipId(String customerCitizenshipId);
    boolean existsByCustomerNameAndCustomerSurnameAndCustomerCitizenshipIdAndCustomersEmailAndCustomersPhoneNumber(
            String customerName, String customerSurname, String customerCitizenshipId,
            String customersEmail, String customersPhoneNumber);
}
