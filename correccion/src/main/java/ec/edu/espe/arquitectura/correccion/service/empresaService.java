package ec.edu.espe.arquitectura.correccion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.correccion.dto.empresaDto;
import ec.edu.espe.arquitectura.correccion.model.empresa;
import ec.edu.espe.arquitectura.correccion.repository.empresaRepository;


@Service
public class empresaService {
    @Autowired
    empresaRepository empresaRepository;


    public empresaService(empresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public empresa crearEmpresaConEmpleados(empresaDto empresaDTO) {
        empresa empresa = EmpresaDtoToEmpresa(empresaDTO);
        return empresaRepository.save(empresa);
    }

    private empresa EmpresaDtoToEmpresa(empresaDto empresaDTO) {
        empresa empresa = new empresa();
        empresa.setRUC(empresaDTO.getRUC());
        empresa.setRazonSocial(empresaDTO.getRazonSocial());
        empresa.setCuentaPrincipal(empresaDTO.getCuentaPrincipal());
        empresa.setEmpleados(empresaDTO.getEmpleados());
        return empresa;
    }
}