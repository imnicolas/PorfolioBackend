
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
public class Contacto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min = 1, max = 600,message="no se puede cargar la informacion")
    private String nombre;
    @NotNull
    @Size(min = 1, max = 600,message="no se puede cargar la informacion")
    private String email;
    @NotNull
    @Size(min = 1, max = 1500,message="no se puede cargar la informacion")
    private String mensaje;    
}
