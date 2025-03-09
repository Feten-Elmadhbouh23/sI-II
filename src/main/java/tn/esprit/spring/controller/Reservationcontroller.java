package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Reservation;
import tn.esprit.spring.service.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class Reservationcontroller {

    @Autowired
    private IReservationService reservationService;

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.retrieveAllReservation();
    }

    @PutMapping
    public Reservation updateReservation(@RequestBody Reservation res) {
        return reservationService.updateReservation(res);
    }

    @GetMapping("/{id}")
    public Reservation getReservation(@PathVariable("id") String idReservation) {
        return reservationService.retrieveReservation(idReservation);
    }

    @GetMapping("/parAnneeEtUniversite")
    public List<Reservation> getReservationsParAnneeEtUniversite(
            @RequestParam int anneeUniversite,
            @RequestParam String nomUniversite) {
        return reservationService.getReservationParAnneeUniversitaireEtNomUniversite(anneeUniversite, nomUniversite);
    }
}
