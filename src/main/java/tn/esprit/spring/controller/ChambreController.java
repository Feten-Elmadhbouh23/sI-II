package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Chambre;
import tn.esprit.spring.service.ChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambres")
public class ChambreController {

    @Autowired
    private ChambreService chambreService;

    @PostMapping
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @GetMapping
    public List<Chambre> getAllChambres() {
        return chambreService.getAllChambres();
    }
}
