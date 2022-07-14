package com.porta.portafolio.Interface;

import com.porta.portafolio.Entity.Contacto;
import java.util.List;


public interface IContactoService {
    
   public List<Contacto> getContacto();
    
    public void saveContacto(Contacto contacto);
    
    public void deleteContacto (int id);
    
    public Contacto findContacto(int id); 
}
