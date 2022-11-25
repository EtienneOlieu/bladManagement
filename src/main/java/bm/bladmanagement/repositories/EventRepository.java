package bm.bladmanagement.repositories;

import bm.bladmanagement.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {
}
