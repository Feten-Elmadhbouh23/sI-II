package tn.esprit.spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Chambre;
import tn.esprit.spring.entity.TypeChambre;
import tn.esprit.spring.repository.IChambreRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChambreService implements IChambreService {
    private final IChambreRepository chambreRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public void deleteChambre(long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre typeChambre) {
        return chambreRepository.findChambresNonReserveesByNomUniversiteAndTypeChambre(nomUniversite, typeChambre);
    }

    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeChambre) {

        return chambreRepository.findByBloc_IdBlocAndTypeChambre(idBloc, typeChambre);
    }

    public List<Chambre> getChambresParBlocEtTypeJPQL(long idBloc, TypeChambre typeChambre) {

        return chambreRepository.findChambresByBlocAndTypeJPQL(idBloc, typeChambre);
    }
}
