
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
public class Estudio {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min = 1, max = 1599, message = "no se pudieron cargar los datos")
    private String establecimiento;
    @NotNull
    @Size(min = 1, max = 1599, message = "no se pudieron cargar los datos")
    private String logro;
    @NotNull
    @Size(min = 1, max = 1599, message = "no se pudieron cargar los datos")
    private String fecha;    
}
