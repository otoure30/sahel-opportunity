// UtilisateurService

package fr.sahelopportunity.Sahel.Opportunity.service;

import fr.sahelopportunity.Sahel.Opportunity.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;

    @Autowired
    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    // methods to handle CRUD operations
}