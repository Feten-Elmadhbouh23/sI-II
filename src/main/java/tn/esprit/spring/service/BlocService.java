package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Bloc;
import tn.esprit.spring.repository.IBlocRepository;


import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

@Service
public class BlocService implements IBlocService {

    @Autowired
    private IBlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveBlocs() {
        return  (List<Bloc>) blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {
        blocRepository.deleteById(idBloc);
    }
}
