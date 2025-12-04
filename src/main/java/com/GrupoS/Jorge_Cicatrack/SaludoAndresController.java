package com.GrupoS.Jorge_Cicatrack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoAndresController {
    @GetMapping("/saludo-andres")
    public String saludar() {
        return "¡Hola desde el ordenador de Andres!";
    }
}