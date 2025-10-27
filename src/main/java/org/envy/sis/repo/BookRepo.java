package org.envy.sis.repo;

import org.envy.sis.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer>{



}
