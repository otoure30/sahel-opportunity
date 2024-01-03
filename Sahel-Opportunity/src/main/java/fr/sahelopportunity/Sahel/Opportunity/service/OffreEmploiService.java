// OffreEmploiService

package fr.sahelopportunity.Sahel.Opportunity.service;

import fr.sahelopportunity.Sahel.Opportunity.repository.OffreEmploiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OffreEmploiService {
    private final OffreEmploiRepository offreEmploiRepository;

    @Autowired
    public OffreEmploiService(OffreEmploiRepository offreEmploiRepository) {
        this.offreEmploiRepository = offreEmploiRepository;
    }

    // methods to handle CRUD operations
}