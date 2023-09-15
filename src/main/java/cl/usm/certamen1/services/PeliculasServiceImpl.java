package cl.usm.certamen1.services;

import cl.usm.certamen1.entities.Pelicula;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class PeliculasServiceImpl implements PeliculasServices{

    List<Pelicula> peliculas = new ArrayList<>();
    @Override
    public List<Pelicula> getAllPeliculas() {
        return peliculas;
    }

    @Override
    public Pelicula createNewPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        return pelicula;
    }

    @Override
    public List<Pelicula> filterPeliculas(String limiteEdad) {
        return peliculas.stream().filter(pelicula ->  {
        if(limiteEdad.equals("Menor_edad")){
            return pelicula.getEdadMinima() <=15;
        }

        if(limiteEdad.equals("Adolescentes")){
            return pelicula.getEdadMinima() >15 && pelicula.getEdadMinima() <18;
        }
        if(limiteEdad.equals("Mayor")){
            return pelicula.getEdadMinima() >=18;
        }
        return false;
        }

        ).collect(Collectors.toList());
    }
}
