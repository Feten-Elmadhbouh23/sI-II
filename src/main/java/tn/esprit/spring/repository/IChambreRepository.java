package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.entity.Chambre;
import tn.esprit.spring.entity.TypeChambre;
import java.util.List;

public interface IChambreRepository extends JpaRepository<Chambre, Long> {

    @Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :idBloc AND c.typeChambre = :typeC")
    List<Chambre> findChambresByBlocAndTypeJPQL(@Param("idBloc") long idBloc, @Param("typeC") TypeChambre typeChambre); // Changement du param 'typeC' en 'typeChambre'

    List<Chambre> findByBloc_IdBlocAndTypeChambre(long idBloc, TypeChambre typeChambre); // Correction de la méthode avec le bon nom de propriété

    @Query("SELECT c FROM Chambre c WHERE c.bloc.nomUniversite = :nomUniversite " +
            "AND c.typeChambre = :typeChambre " +
            "AND c.idChambre NOT IN (SELECT r.chambre.idChambre FROM Reservation r WHERE r.anneeUniversitaire = CURRENT_DATE)")
    List<Chambre> findChambresNonReserveesByNomUniversiteAndTypeChambre(
            @Param("nomUniversite") String nomUniversite,
            @Param("typeChambre") TypeChambre typeChambre
    );
}
