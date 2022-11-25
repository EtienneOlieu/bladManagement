package bm.bladmanagement.repositories;

import bm.bladmanagement.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
