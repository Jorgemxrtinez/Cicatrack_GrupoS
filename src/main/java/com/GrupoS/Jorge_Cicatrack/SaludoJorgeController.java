package com.GrupoS.Jorge_Cicatrack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoJorgeController {

    @GetMapping("/saludo-jorge")
    public String saludar() {
        return "¡HOLA MUNDO DESDE LA RAMA DE JORGE MARTINEZ!";
    }
}