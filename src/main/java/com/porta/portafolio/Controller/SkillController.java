
package com.porta.portafolio.Controller;

import com.porta.portafolio.Entity.Skill;
import com.porta.portafolio.Interface.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins= "*")

public class SkillController {
    @Autowired
    ISkillService iskillService;
    
    @GetMapping("skills/traer")
    public List<Skill>getSkill(){
     return iskillService.getSkill();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/skills/crear")
    public void createSkill(@RequestBody Skill skill){
        iskillService.saveSkill(skill);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/skills/borrar/{id}")
    public void deleteSkill (@PathVariable Integer id){
        iskillService.deleteSkill(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/skills/editar/{id}")
    public Skill editSkill(@PathVariable("id") Integer id,
                              @RequestBody Skill skill)
    {
        
        skill.setId(id);
    
    iskillService.saveSkill(skill);
    return skill;
    }
    
    @GetMapping(path = {"/skills/{id}"})
    public Skill findSkill(@PathVariable("id")int id){
        return iskillService.findSkill(id);
    }
    
}
