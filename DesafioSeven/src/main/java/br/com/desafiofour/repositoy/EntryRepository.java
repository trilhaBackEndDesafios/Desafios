package br.com.desafiofour.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.desafiofour.model.entity.Entry;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {
	
	@Query("from Entry where category_id = :id")
	List<Entry> buscaCategoriaId (@Param("id") Long id);

}
