package bm.bladmanagement.repositories;

import bm.bladmanagement.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
