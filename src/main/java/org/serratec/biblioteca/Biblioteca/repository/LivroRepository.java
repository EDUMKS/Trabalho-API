package org.serratec.biblioteca.Biblioteca.repository;

import org.serratec.biblioteca.Biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

	
	
}
