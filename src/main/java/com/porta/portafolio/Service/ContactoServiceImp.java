
package com.porta.portafolio.Service;

import com.porta.portafolio.Entity.Contacto;
import com.porta.portafolio.Interface.IContactoService;
import com.porta.portafolio.Repository.IContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoServiceImp implements IContactoService{

@Autowired IContactoRepository icontactoRepository;
    
 @Override
    public List<Contacto> getContacto() {
        List<Contacto> contacto = icontactoRepository.findAll();
        return contacto;
    }

 @Override
    public void saveContacto(Contacto contacto) {
       icontactoRepository.save(contacto);
    }

  @Override
    public void deleteContacto(int id) {
     icontactoRepository.deleteById(id);
    }

 @Override
    public Contacto findContacto(int id) {
       Contacto contacto= icontactoRepository.findById(id).orElse(null);
       return contacto;
    }
}