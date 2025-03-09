package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.entity.Bloc;


public interface IBlocRepository extends CrudRepository<Bloc, Long> {
}
