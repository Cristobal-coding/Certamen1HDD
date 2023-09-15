package cl.usm.certamen1.services;

import cl.usm.certamen1.entities.Pelicula;

import java.util.List;



public interface PeliculasServices {

    List<Pelicula> getAllPeliculas();
    Pelicula createNewPelicula(Pelicula pelicula);
    List<Pelicula> filterPeliculas(String limiteEdad);
}
