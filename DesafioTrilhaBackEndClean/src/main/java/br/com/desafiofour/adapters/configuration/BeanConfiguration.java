package br.com.desafiofour.adapters.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.desafiofour.DesafioHexagonalApplication;
import br.com.desafiofour.aplication.ports.CategoryRepositoryPort;
import br.com.desafiofour.aplication.ports.CategoryServicePort;
import br.com.desafiofour.aplication.ports.EntryRepositoryPort;
import br.com.desafiofour.aplication.ports.EntryServicePort;
import br.com.desafiofour.aplication.service.CategoryService;
import br.com.desafiofour.aplication.service.EntryService;

@Configuration
@ComponentScan(basePackageClasses = DesafioHexagonalApplication.class)
public class BeanConfiguration {
	@Bean
	CategoryServicePort categoryService(CategoryRepositoryPort categoryRepositoryPort) {

		return new CategoryService(categoryRepositoryPort);
	}

	@Bean
	EntryServicePort entryService(EntryRepositoryPort entryRepositoryPort) {

		return new EntryService(entryRepositoryPort);
	}
}
