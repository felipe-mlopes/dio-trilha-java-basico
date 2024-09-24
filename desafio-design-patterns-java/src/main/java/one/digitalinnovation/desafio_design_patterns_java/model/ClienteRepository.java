package one.digitalinnovation.desafio_design_patterns_java.model;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
