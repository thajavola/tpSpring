package cdan4.tp.controller;
import cdan4.tp.repository.CompteRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cdan4.tp.entity.Compte;
import cdan4.tp.service.CompteService;

@Controller


public class CompteController {
    @Autowired
    CompteService compteService;
    
    


    @GetMapping("/listeCompte/")
    public List<Compte> listeCompte(){

        return compteService.getAll();
    }

   

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer idcompte, Model model) {
    compteService.del(idcompte);
    return "redirect:/afficheCompte";
}

    @PostMapping("/saveCompte/{idcompte},{nom},{prenom},{adresse},{contact},{genre},{mail},{mot_de_passe}")
    public void saveCompte(@PathVariable("idcompte") Integer idcompte,@PathVariable("nom") String nom,@PathVariable("prenom") String prenom,@PathVariable("adresse") String adresse,@PathVariable("contact") String contact,@PathVariable("genre") String genre,@PathVariable("mail") String mail,@PathVariable("mot_de_passe") String mot_de_passe){
        Compte compte =new Compte();
        
        compte.setAdresse(adresse);
        compte.setContact(contact);
        compte.setGenre(genre);
        compte.setIdcompte(idcompte);
        compte.setMail(mail);
        compte.setMot_de_passe(mot_de_passe);
        compte.setNom(nom);
        compte.setPrenom(prenom);
        compteService.insert(compte);
    }

    @GetMapping(path = "/afficheCompte")
    public String  afficheCompte(Model model){
        Compte compte = new Compte();
        List<Compte> listcompte = compteService.getAll();
        // model.addAttribute("comtpeBean", compte);
        model.addAttribute("comptes", listcompte);
        return "afficheCpt";

    }
    
    @GetMapping(path = "/affiche/{id}")
    public String  afficheCompte(@PathVariable("id") Integer idcompte, Model model){
       
        Compte compte = compteService.getIdCompte(idcompte);
       
        model.addAttribute("compte", compte);

     
        return "rechercheCpt";

    }



}




