package tn.esprit.spring.service;

import tn.esprit.spring.entity.Reservation;
import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();
    Reservation updateReservation(Reservation res);
    Reservation retrieveReservation(String idReservation);
    List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(int anneeUniversite, String nomUniversite);
}
