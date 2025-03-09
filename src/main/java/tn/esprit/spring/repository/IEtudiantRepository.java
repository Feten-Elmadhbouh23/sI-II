package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.entity.Etudiant;


public interface IEtudiantRepository extends CrudRepository<Etudiant, Long> {
}
