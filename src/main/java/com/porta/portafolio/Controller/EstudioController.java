
package com.porta.portafolio.Controller;

import com.porta.portafolio.Entity.Estudio;
import com.porta.portafolio.Interface.IEstudioService;
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

@RestController
@CrossOrigin(origins="*")
public class EstudioController {
    
    @Autowired
    IEstudioService iestudioService;
    
    @GetMapping("estudios/traer")
    public List<Estudio>getEstudio(){
     return iestudioService.getEstudio();   
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/estudios/crear")
    public void createEstudio(@RequestBody Estudio estudio){
        iestudioService.saveEstudio(estudio);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/estudios/borrar/{id}")
    public void deleteEstudio (@PathVariable Integer id){
        iestudioService.deleteEstudio(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/estudios/editar/{id}")
    public Estudio editEstudio(@PathVariable("id") Integer id,
                              @RequestBody Estudio estudio)
    {
        
        estudio.setId(id);
    
    iestudioService.saveEstudio(estudio);
    return estudio;
    }
    
    @GetMapping(path = {"/estudios/{id}"})
    public Estudio listarId(@PathVariable("id")int id){
        return iestudioService.findEstudio(id);
    }
}
