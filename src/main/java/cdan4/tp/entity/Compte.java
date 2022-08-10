package cdan4.tp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Compte {
    @Id
    @Column(nullable = false)
    private Integer idcompte;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String mail; 
    @Column
    private String genre;
    @Column
    private String contact;
    @Column
    private String adresse;
    @Column
    private String mot_de_passe;

}
