package com.ruveyda.service;

import com.ruveyda.entity.Country;
import com.ruveyda.repository.CountryRepository;
import com.ruveyda.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends ServiceManager<Country,Long> {
    private final CountryRepository countryRepository;


    public CountryService(CountryRepository countryRepository) {
        super(countryRepository);
        this.countryRepository = countryRepository;
    }

}
