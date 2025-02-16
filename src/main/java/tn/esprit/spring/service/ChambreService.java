package tn.esprit.spring.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Chambre;
import tn.esprit.spring.repository.ChambreRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ChambreService {

    @Autowired
    private ChambreRepository chambreRepository;

    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    public Optional<Chambre> getChambreById(Long id) {
        return chambreRepository.findById(id);
    }

    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    public Chambre updateChambre(Long id, Chambre chambreDetails) {
        Chambre chambre = chambreRepository.findById(id).orElseThrow();
        chambre.setNumeroChambre(chambreDetails.getNumeroChambre());
        chambre.setTypeC(chambreDetails.getTypeC());
        return chambreRepository.save(chambre);
    }

    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }
}