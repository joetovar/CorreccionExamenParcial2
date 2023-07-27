package ec.edu.espe.arquitectura.correccion.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.correccion.dto.empresaDto;
import ec.edu.espe.arquitectura.correccion.model.empresa;

import ec.edu.espe.arquitectura.correccion.service.empresaService;

@RestController
@RequestMapping("/empresa")

public class empresaController {
    
 @Autowired
    empresaService empresaService;

     @PostMapping
    public ResponseEntity<empresa> crearEmpresa(@RequestBody empresaDto empresaDTO) {
        empresa nuevaEmpresa = empresaService.crearEmpresaConEmpleados(empresaDTO);
        return ResponseEntity.ok(nuevaEmpresa);
    }

}
