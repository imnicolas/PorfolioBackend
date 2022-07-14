
package com.porta.portafolio.Controller;

import com.porta.portafolio.Entity.Proyecto;
import com.porta.portafolio.Interface.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class ProyectoController {
    @Autowired
    IProyectoService iproyectoService;
    
    @GetMapping("proyectos/traer")
    public List<Proyecto>getProyecto(){
     return iproyectoService.getProyecto();   
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/proyectos/crear")
    public void createProyecto(@RequestBody Proyecto proyecto){
        iproyectoService.saveProyecto(proyecto);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/proyectos/borrar/{id}")
    public void deleteProyecto (@PathVariable Integer id){
        iproyectoService.deleteProyecto(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/proyectos/editar/{id}")
    public Proyecto editProyecto(@PathVariable("id") Integer id,
                              @RequestBody Proyecto proyecto)
    {
        
        proyecto.setId(id);
    
    iproyectoService.saveProyecto(proyecto);
    return proyecto;
    }
    
    @GetMapping(path = {"/proyectos/{id}"})
    public Proyecto findProyecto(@PathVariable("id")int id){
        return iproyectoService.findProyecto(id);
    }
}
