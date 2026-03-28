package com.example.demo_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_service.model.entity.Proveedor;
import com.example.demo_service.repository.ProveedorRepository;
import com.example.demo_service.service.ProveedorService;

@RestController
@RequestMapping("/api/proveedores")

public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @Autowired
    private ProveedorRepository proveedorRepository;

    @GetMapping
    public List<Proveedor> listarProveedores() {
        return proveedorRepository.findAll();
    }

    @PostMapping
    public Proveedor crearProveedor(@RequestBody Proveedor proveedor) {
        return proveedorService.guardarProveedor(proveedor);
    }

    @GetMapping("/buscar")
    public List<Proveedor> buscarProveedores(@RequestParam String nombre) {
        return proveedorService.buscarProveedoresPorNombre(nombre);
    }

}
