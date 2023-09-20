/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uv.PracticaWeb05.Empleado;

/**
 *
 * @author Johan
 */
public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
    
}
