
package com.porta.portafolio.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.*;

@Getter @Setter
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min=1,max=600, message = "no me cumple la condicion")
    private String nombre;
    @NotNull
    @Size(min=1,max=600, message = "no me cumple la condicion")
    private int progress;
    @NotNull
    @Size(min=1,max=600, message = "no me cumple la condicion")
    private String img;
}
