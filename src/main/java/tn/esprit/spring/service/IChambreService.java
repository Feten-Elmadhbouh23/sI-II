package tn.esprit.spring.service;


import tn.esprit.spring.entity.Chambre;
import tn.esprit.spring.entity.TypeChambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre(Chambre c);
    Chambre retrieveChambre(long idChambre);


    List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type);

    List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC);

    List<Chambre> getChambresParBlocEtTypeJPQL(long idBloc, TypeChambre typeC);

    void deleteChambre(long idChambre);
}
