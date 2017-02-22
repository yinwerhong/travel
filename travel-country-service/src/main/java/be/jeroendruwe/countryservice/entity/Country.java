package be.jeroendruwe.countryservice.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(nullable = false)
	private String name;

	@NotNull
	@Column(columnDefinition = "bpchar(2)", nullable = false)
	private String iso;

	public Country(String name, String iso) {
		this.name = name;
		this.iso = iso;
	}

	Country() {

	}

	public String getName() {
		return name;
	}

	public String getIso() {
		return iso;
	}
}
