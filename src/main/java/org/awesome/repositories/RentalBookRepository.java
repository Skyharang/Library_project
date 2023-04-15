package org.awesome.repositories;

import org.awesome.entities.RentalBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalBookRepository extends JpaRepository<RentalBook, String> {
}
