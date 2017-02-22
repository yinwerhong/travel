package be.jeroendruwe.countryservice.repository;

import be.jeroendruwe.countryservice.entity.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long> {}
