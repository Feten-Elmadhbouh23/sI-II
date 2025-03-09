package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.entity.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationRepository extends CrudRepository<Reservation, Long> {

    @Query("SELECT r FROM Reservation r WHERE FUNCTION('YEAR', r.dateDebut) = FUNCTION('YEAR', :anneeUniversite) " +
            "AND r.chambre.foyer.universite.nomUniversite = :nomUniversite")
    List<Reservation> findReservationsByAnneeUniversitaireAndNomUniversite(
            @Param("anneeUniversite") int anneeUniversite,
            @Param("nomUniversite") String nomUniversite);
}
