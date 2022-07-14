
package com.porta.portafolio.Interface;

import com.porta.portafolio.Entity.Estudio;
import java.util.List;



public interface IEstudioService {
    
    public List<Estudio> getEstudio();
    
    public void saveEstudio (Estudio estudio);
    
    public void deleteEstudio (int id);
    
    public Estudio findEstudio(int id);
}
