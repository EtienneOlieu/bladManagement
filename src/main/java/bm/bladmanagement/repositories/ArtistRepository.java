package bm.bladmanagement.repositories;

import bm.bladmanagement.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist,Long> {
}
