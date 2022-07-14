package com.porta.portafolio.Service;

import com.porta.portafolio.Entity.Persona;
import com.porta.portafolio.Interface.IPersonaService;
import com.porta.portafolio.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements IPersonaService{
    
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
       ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(int id) {
     ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(int id) {
       Persona persona= ipersonaRepository.findById(id).orElse(null);
       return persona;
    }
}