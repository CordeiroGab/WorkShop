package org.projetospring.workshop.repositories;

import org.projetospring.workshop.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository  extends JpaRepository<Category, Long> {
}
