package br.com.financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.financeiro.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
