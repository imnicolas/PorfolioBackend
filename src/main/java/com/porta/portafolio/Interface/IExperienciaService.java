
package com.porta.portafolio.Interface;

import com.porta.portafolio.Entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> getExperiencia();
    
    public void saveExperiencia(Experiencia experiencia);
    
    public void deleteExperiencia (int id);
    
    public Experiencia findExperiencia(int id);
}
