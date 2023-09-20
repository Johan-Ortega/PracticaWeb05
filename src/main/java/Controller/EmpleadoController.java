/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uv.PracticaWeb05.Empleado;

/**
 *
 * @author Johan
 */

@RestController
@RequestMapping("/api")
public class EmpleadoController {
    
    @Autowired
    EmpleadoRepository empleadoRepository;
    
    @PostMapping("/empleado")
    
    public ResponseEntity<Empleado> createEmpleados(@RequestBody Empleado empleado){
        Empleado emp = empleadoRepository.save(empleado);
        return new ResponseEntity<>(emp,HttpStatus.CREATED);
    }
}
