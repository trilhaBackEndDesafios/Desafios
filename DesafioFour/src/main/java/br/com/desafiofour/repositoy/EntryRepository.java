package br.com.desafiofour.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafiofour.model.Entry;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {

}
