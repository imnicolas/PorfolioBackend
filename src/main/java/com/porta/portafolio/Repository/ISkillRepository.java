
package com.porta.portafolio.Repository;

import com.porta.portafolio.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository extends JpaRepository<Skill,Integer>{
    
}
