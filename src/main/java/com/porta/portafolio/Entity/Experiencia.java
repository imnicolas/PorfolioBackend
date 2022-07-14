
package com.porta.portafolio.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size (min=1, max=300, message = "no hay nada para cargar")
    private String nombre;
    @NotNull
    @Size (min=1, max=300, message = "no hay nada para cargar")
    private String puesto;
    @NotNull
    @Size (min=1, max=300, message = "no hay nada para cargar")
    private String fecha;
}
