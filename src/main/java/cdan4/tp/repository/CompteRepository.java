package cdan4.tp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import cdan4.tp.entity.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte,Integer>{

    // /**
    //  * @param nom
    //  * @return
    //  */
     List<Compte> findByNom(@Param("nom") String nom);
     List<Compte> findByIdcompte(@Param("idcompte") Integer idcompte);
}
