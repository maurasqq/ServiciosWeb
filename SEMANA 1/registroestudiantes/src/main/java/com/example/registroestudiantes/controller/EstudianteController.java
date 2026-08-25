package com.example.registroestudiantes.controller;

import com.example.registroestudiantes.model.Estudiante;
import com.example.registroestudiantes.service.EstudianteService;
import com.example.registroestudiantes.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private com.example.registroestudiantes.service.EstudianteService service;

    @GetMapping
    public List<Estudiante> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Estudiante buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante e) {
        return service.guardar(e);
    }

    @PutMapping("/{id}")
    public Estudiante actualizar(@PathVariable Long id, @RequestBody Estudiante e) {
        return service.actualizar(id, e);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}