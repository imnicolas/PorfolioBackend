
package com.porta.portafolio.Repository;

import com.porta.portafolio.Entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudioRepository extends JpaRepository<Estudio,Integer>{    
}
