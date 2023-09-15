package cl.usm.certamen1.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Pelicula {
    private String nombre;
    private String nombreAbreviado;
    private int edadMinima;
    private String genero;

}
