package edu.galileo.agenda.controller;

import edu.galileo.agenda.model.Contacto;
import edu.galileo.agenda.service.ContactoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contacto")
public class ContactoController {
    private final ContactoService contactoService;

    ContactoController(ContactoService contactoService) {
        this.contactoService = contactoService;
    }

    @GetMapping
    public String getMiNombre() {
        return "Alejandro Garcia - 18011502";
    }

    @GetMapping("/lista")
    public List<Contacto> getAll() {
        return this.contactoService.List();
    }

    @PostMapping
    public Contacto add(@RequestBody(required = true) Contacto contacto) {
        return this.contactoService.add(contacto);
    }
}