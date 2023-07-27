package ec.edu.espe.arquitectura.correccion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.correccion.dto.pagoRolDto;
import ec.edu.espe.arquitectura.correccion.model.pagoRol;
import ec.edu.espe.arquitectura.correccion.service.pagoRolService;

@RestController
@RequestMapping("/pagorol")

public class pagoRolController {
    @Autowired
    pagoRolService pagoRolService;

    
    public pagoRolController(pagoRolService pagoRolService) {
        this.pagoRolService = pagoRolService;
    }

    @PostMapping
    public ResponseEntity<pagoRol> crearPagoRol(@RequestBody pagoRolDto pagoRolDTO) {
        pagoRol nuevoPagoRol = pagoRolService.crearPagoRol(pagoRolDTO);
        return ResponseEntity.ok(nuevoPagoRol);
    }

    @GetMapping("/{rucEmpresa}/{mes}")
    public ResponseEntity<List<pagoRolDto>> obtenerPagosPorMesYEmpresa(
            @PathVariable String rucEmpresa, @PathVariable String mes) {
        List<pagoRolDto> pagos = pagoRolService.obtenerPagosPorMesYEmpresa(rucEmpresa, mes);
        return new ResponseEntity<>(pagos, HttpStatus.OK);
    }
}
