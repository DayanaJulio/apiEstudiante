package com.example.estudiante.service;

import com.example.estudiante.model.Estudiante;
import com.example.estudiante.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteServiceImple {

    private final EstudianteRepository estudianteRepository;

    @Autowired
    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }
    @Override
    public ArrayList<Estudiante> getAllEstudiante() {
        return (ArrayList<Estudiante>) estudianteRepository.findAll() ;
    }

    @Override
    public Optional<Estudiante> getEstudianteById(long id) {
        return estudianteRepository.findById(id);
    }

    @Override
    public Estudiante saveEstudiante(Estudiante e) {
        return estudianteRepository.save(e);
    }

    @Override
    public boolean deleteEstudianteById(long id) {
        try {
            Optional<Estudiante> e=getEstudianteById(id);
            estudianteRepository.delete(e.get());
            return true;
        }catch(Exception e){
            return false;
        }

    }
}
