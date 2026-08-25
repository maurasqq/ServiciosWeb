package com.example.registroestudiantes.service;

import com.example.registroestudiantes.model.Estudiante;
import com.example.registroestudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository repo;

    public List<Estudiante> listar() {
        return repo.findAll();
    }

    public Estudiante buscar(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Estudiante guardar(Estudiante e) {
        return repo.save(e);
    }

    public Estudiante actualizar(Long id, Estudiante e) {
        e.setId(id);
        return repo.save(e);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}