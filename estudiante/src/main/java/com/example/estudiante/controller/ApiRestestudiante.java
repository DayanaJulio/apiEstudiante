package com.example.estudiante.controller;

import com.example.estudiante.model.Estudiante;
import com.example.estudiante.service.EstudianteServiceImple;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiRestestudiante {
    private final EstudianteServiceImple estudianteService;


    public ApiRestestudiante(EstudianteServiceImple estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping("/saludar")
    public String saludar(){ return "Porfin aprendiendo Spring juyuuuu hola";}

    @GetMapping("/all")
    public ArrayList<Estudiante> getAllEstudiante() {
        return estudianteService.getAllEstudiante();
    }

    @GetMapping("/find/{id}")
    public Optional<Estudiante> getEstudianteById(@PathVariable("id")long id){
        return estudianteService.getEstudianteById(id);
    }
    @PostMapping("/save")
    public Estudiante saveEstudiante(@RequestBody Estudiante e){
        return estudianteService.saveEstudiante(e);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEstudianteById(@PathVariable("id")long id){
        if(estudianteService.deleteEstudianteById(id))
            return "se ha borrado un estudiante";
        else
            return "no se ha borrado el estudiante";
    }
}
