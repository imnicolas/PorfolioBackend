
package com.porta.portafolio.Interface;

import com.porta.portafolio.Entity.Proyecto;
import java.util.List;


public interface IProyectoService {
    
     public List<Proyecto> getProyecto();
    
    public void saveProyecto(Proyecto proyecto);
    
    public void deleteProyecto (int id);
    
    public Proyecto findProyecto(int id);
}
