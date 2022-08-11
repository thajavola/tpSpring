package cdan4.tp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdan4.tp.entity.Compte;
import cdan4.tp.repository.CompteRepository;

@Service
public class CompteService {
    
    @Autowired
    private CompteRepository compteRepository;

    public List<Compte> getAll(){
        return compteRepository.findAll();
        
    }

    public List<Compte> getNom(String nom){
        return compteRepository.findByNom(nom);
        
    }

    public List<Compte> getId(Integer idcompte){
        return compteRepository.findByIdcompte(idcompte);
        
    }
    
    public Compte getIdCompte(Integer idcompte){
        return compteRepository.findById(idcompte).orElseThrow();
        
    }

    public void insert(Compte s){
        compteRepository.save(s);
    }

    public void del(Integer idcompte){
    Compte compte =  compteRepository.findById(idcompte).orElseThrow();
     
      compteRepository.delete(compte);
    }

   
        
    }
    

