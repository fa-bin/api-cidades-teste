package com.github.fabin.apicidades.countries.repository;

import com.github.fabin.apicidades.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
