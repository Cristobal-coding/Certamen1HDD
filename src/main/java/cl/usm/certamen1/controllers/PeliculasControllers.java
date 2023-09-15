package cl.usm.certamen1.controllers;

import cl.usm.certamen1.entities.Pelicula;
import cl.usm.certamen1.services.PeliculasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PeliculasControllers {

    @Autowired
    PeliculasServices peliculasServices;

    @GetMapping("/verPeliculas")
    ResponseEntity<List<Pelicula>> getAllPeliculas(){
        try{
            return ResponseEntity.ok(this.peliculasServices.getAllPeliculas());
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping("/crearPelicula")
    ResponseEntity<Pelicula> createPelicula(@RequestBody Pelicula pelicula){
        try{
            Pelicula newPelicula = this.peliculasServices.createNewPelicula(pelicula);
            return ResponseEntity.ok(newPelicula);
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/verPeliculas/{limite}")
    ResponseEntity<List<Pelicula>> filterPeliculas(@PathVariable String limite){
        try{
            return ResponseEntity.ok(this.peliculasServices.filterPeliculas(limite));
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }
}
