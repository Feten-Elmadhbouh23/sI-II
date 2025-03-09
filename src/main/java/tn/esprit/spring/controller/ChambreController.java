package tn.esprit.spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Chambre;
import tn.esprit.spring.entity.TypeChambre;
import tn.esprit.spring.service.IChambreService;
import java.util.List;

@RestController
@RequestMapping("/chambres")
@RequiredArgsConstructor
public class Chambrecontroller {
    private final IChambreService chambreService;

    @GetMapping
    public List<Chambre> getAllChambres() {
        return chambreService.retrieveAllChambres();
    }

    @PostMapping
    public Chambre createChambre(@RequestBody Chambre c) {
        return chambreService.addChambre(c);
    }

    @PutMapping
    public Chambre updateChambre(@RequestBody Chambre c) {
        return chambreService.updateChambre(c);
    }

    @GetMapping("/{id}")
    public Chambre getChambre(@PathVariable("id") long idChambre) {
        return chambreService.retrieveChambre(idChambre);
    }

    @DeleteMapping("/{id}")
    public void deleteChambre(@PathVariable("id") long idChambre) {
        chambreService.deleteChambre(idChambre);
    }

    @GetMapping("/nonReservees")
    public List<Chambre> getChambresNonReservees(@RequestParam String nomUniversite,
                                                 @RequestParam TypeChambre type) {
        return chambreService.getChambresNonReserveParNomUniversiteEtTypeChambre(nomUniversite, type);
    }

    @GetMapping("/parBlocEtType")
    public List<Chambre> getChambresParBlocEtType(@RequestParam long idBloc,
                                                  @RequestParam TypeChambre typeC) {
        return chambreService.getChambresParBlocEtType(idBloc, typeC);
    }

    @GetMapping("/parBlocEtTypeJPQL")
    public List<Chambre> getChambresParBlocEtTypeJPQL(@RequestParam long idBloc,
                                                      @RequestParam TypeChambre typeC) {
        return chambreService.getChambresParBlocEtTypeJPQL(idBloc, typeC);
    }
}
