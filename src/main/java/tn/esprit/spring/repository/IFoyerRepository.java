package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.entity.Foyer;


public interface IFoyerRepository extends CrudRepository<Foyer, Long> {
}
