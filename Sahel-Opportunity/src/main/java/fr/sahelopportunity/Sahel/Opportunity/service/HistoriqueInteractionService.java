// HistoriqueInteractionService
package fr.sahelopportunity.Sahel.Opportunity.service;

import fr.sahelopportunity.Sahel.Opportunity.repository.HistoriqueInteractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoriqueInteractionService {
    private final HistoriqueInteractionRepository historiqueInteractionRepository;

    @Autowired
    public HistoriqueInteractionService(HistoriqueInteractionRepository historiqueInteractionRepository) {
        this.historiqueInteractionRepository = historiqueInteractionRepository;
    }

    // methods to handle CRUD operations
}