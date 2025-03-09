package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.entity.Universite;


public interface IUniversiteRepository extends CrudRepository<Universite, Long> {
}
