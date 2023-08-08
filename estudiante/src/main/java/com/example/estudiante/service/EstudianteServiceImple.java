package com.example.estudiante.service;

import com.example.estudiante.model.Estudiante;

import java.util.ArrayList;
import java.util.Optional;

public interface EstudianteServiceImple {
    ArrayList<Estudiante> getAllEstudiante();

    Optional<Estudiante> getEstudianteById(long id);

    Estudiante saveEstudiante(Estudiante e);

    boolean deleteEstudianteById(long id);
}
