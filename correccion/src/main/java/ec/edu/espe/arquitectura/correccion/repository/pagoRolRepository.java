package ec.edu.espe.arquitectura.correccion.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.arquitectura.correccion.model.pagoRol;

@Repository
public interface pagoRolRepository extends MongoRepository<pagoRol, String> {
     List<pagoRol> findByRucEmpresaAndMes(String rucEmpresa, String mes);
}
