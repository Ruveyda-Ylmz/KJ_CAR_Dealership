package com.ruveyda.repository;

import com.ruveyda.entity.Address;
import com.ruveyda.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
    boolean existsByStreetAndCityAndApartmentNoAndPostalCodeAndCountryId(
            String street, String city, String apartmentNo, String postalCode, Long countryId);
    Optional<Address> findByStreetAndCityAndApartmentNoAndPostalCodeAndCountryId(
            String street, String city, String apartmentNo, String postalCode, Long countryId);
}
