
package com.porta.portafolio.Repository;
        
import com.porta.portafolio.Entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactoRepository extends JpaRepository<Contacto,Integer>{
    
}
