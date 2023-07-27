package ec.edu.espe.arquitectura.correccion.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.correccion.dto.pagoRolDto;
import ec.edu.espe.arquitectura.correccion.model.pagoRol;
import ec.edu.espe.arquitectura.correccion.repository.pagoRolRepository;

@Service
public class pagoRolService {


    @Autowired
    private final pagoRolRepository pagoRolRepository;

    
    public pagoRolService(pagoRolRepository pagoRolRepository) {
        this.pagoRolRepository = pagoRolRepository;
    }

    public pagoRol crearPagoRol(pagoRolDto pagoRolDTO) {
        pagoRol pagoRol = PagoRolDtoToPagoRol(pagoRolDTO);
        return pagoRolRepository.save(pagoRol);
    }

    public List<pagoRolDto> obtenerPagosPorMesYEmpresa(String rucEmpresa, String mes) {
        List<pagoRol> pagos = pagoRolRepository.findByRucEmpresaAndMes(rucEmpresa, mes);
        return pagos.stream().map(this::pagoRolToPagoRolDto).collect(Collectors.toList());
    }

    private pagoRol PagoRolDtoToPagoRol(pagoRolDto pagoRolDTO) {
        pagoRol pagoRol = new pagoRol();
        pagoRol.setMes(pagoRolDTO.getMes());
        pagoRol.setFechaProceso(pagoRolDTO.getFechaProceso());
        pagoRol.setRucEmpresa(pagoRolDTO.getRucEmpresa());
        pagoRol.setCuentaPrincipal(pagoRolDTO.getCuentaPrincipal());
        pagoRol.setValorTotal(BigDecimal.ZERO);
        pagoRol.setValorReal(BigDecimal.ZERO);
        pagoRol.setEmpleadosPago(pagoRolDTO.getEmpleadosPago());
        return pagoRol;
    }

    private pagoRolDto PagoRolToPagoRolDto(pagoRol pagoRol) {
        pagoRolDto pagoRolDTO = new pagoRolDto();
        pagoRolDTO.setMes(pagoRol.getMes());
        pagoRolDTO.setFechaProceso(pagoRol.getFechaProceso());
        pagoRolDTO.setRucEmpresa(pagoRol.getRucEmpresa());
        pagoRolDTO.setCuentaPrincipal(pagoRol.getCuentaPrincipal());
        pagoRolDTO.setEmpleadosPago(pagoRol.getEmpleadosPago());
        return pagoRolDTO;
    }
    
}