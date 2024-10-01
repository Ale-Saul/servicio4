package com.example.servicio4;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @PostMapping("/createClient")
    public String createClient(@RequestBody ClientRequest clientRequest) {
        // Lógica simple para crear el cliente
        return "Cliente creado exitosamente: " + clientRequest.getNombre() + " " + clientRequest.getApellidoPaterno();
    }
}