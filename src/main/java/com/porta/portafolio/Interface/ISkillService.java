
package com.porta.portafolio.Interface;

import com.porta.portafolio.Entity.Skill;
import java.util.List;


public interface ISkillService {
    
    public List<Skill> getSkill();
    
    public void saveSkill(Skill skill);
    
    public void deleteSkill (int id);
    
    public Skill findSkill(int id);
    
}
