package com.porta.portafolio.Interface;

import com.porta.portafolio.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona (int id);
    
    public Persona findPersona(int id);
}