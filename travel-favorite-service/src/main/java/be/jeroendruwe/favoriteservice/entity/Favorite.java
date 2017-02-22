package be.jeroendruwe.favoriteservice.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Favorite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(nullable = false)
	private Long attractionId;

	@NotNull
	@Column(nullable = false)
	private Long userId;

	public Favorite(Long attractionId, Long userId) {
		this.attractionId = attractionId;
		this.userId = userId;
	}

	Favorite() {}

	public Long getAttractionId() {
		return attractionId;
	}

	public Long getUserId() {
		return userId;
	}
}
