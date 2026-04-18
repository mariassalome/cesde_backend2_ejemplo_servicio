package com.example.demo_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_service.model.entity.Proveedor;
import com.example.demo_service.repository.ProveedorRepository;

@Service
public class ProveedorService {

    @Autowired 
    private ProveedorRepository proveedorRepository;

    public Proveedor guardarProveedor (Proveedor proveedor) { 
        if (proveedor.getTelefono() != null && proveedor.getTelefono().length() == 10) {
            return proveedorRepository.save(proveedor);
        } else {
            throw new IllegalArgumentException ( "El número de teléfono debe tener 10 dígitos.");
        }

    }

    public List<Proveedor> buscarProveedoresPorNombre(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarProveedoresPorNombre'");
    }

}
