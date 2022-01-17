package br.com.desafiofour.adapters.outbound.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.desafiofour.adapters.outbound.entities.EntryEntity;

@Repository
public interface EntryRepository extends JpaRepository<EntryEntity, Long> {
	
	@Query("from Entry where category_id = :id")
	List<EntryEntity> buscaCategoriaId (@Param("id") Long id);

}
