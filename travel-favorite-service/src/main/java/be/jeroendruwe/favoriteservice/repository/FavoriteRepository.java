package be.jeroendruwe.favoriteservice.repository;

import be.jeroendruwe.favoriteservice.entity.Favorite;
import org.springframework.data.repository.CrudRepository;

public interface FavoriteRepository extends CrudRepository<Favorite, Long> {

	// TODO implement get favorites by userId

}
