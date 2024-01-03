// EvenementService
package fr.sahelopportunity.Sahel.Opportunity.service;

import fr.sahelopportunity.Sahel.Opportunity.repository.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvenementService {
    private final EvenementRepository evenementRepository;

    @Autowired
    public EvenementService(EvenementRepository evenementRepository) {
        this.evenementRepository = evenementRepository;
    }

    // methods to handle CRUD operations
}