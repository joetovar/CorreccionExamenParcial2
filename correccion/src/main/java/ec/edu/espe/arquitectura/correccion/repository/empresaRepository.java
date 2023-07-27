package ec.edu.espe.arquitectura.correccion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.arquitectura.correccion.model.empresa;

@Repository
public interface empresaRepository extends MongoRepository<empresa, String> {
}
