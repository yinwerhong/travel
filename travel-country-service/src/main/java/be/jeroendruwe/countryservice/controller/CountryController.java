package be.jeroendruwe.countryservice.controller;

import be.jeroendruwe.countryservice.constant.AuthoritiesConstants;
import be.jeroendruwe.countryservice.entity.Country;
import be.jeroendruwe.countryservice.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class CountryController {

	@Autowired
	private CountryRepository countryRepository;

	@PreAuthorize("hasAuthority('" + AuthoritiesConstants.ADMIN + "')")
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Iterable<Country> getAll() {
		return countryRepository.findAll();
	}

}
