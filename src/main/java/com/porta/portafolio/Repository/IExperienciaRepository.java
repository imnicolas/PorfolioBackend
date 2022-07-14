
package com.porta.portafolio.Repository;

import com.porta.portafolio.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia,Integer>{
    
}
