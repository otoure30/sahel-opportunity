// OpportuniteFinancementService

package fr.sahelopportunity.Sahel.Opportunity.service;

import fr.sahelopportunity.Sahel.Opportunity.repository.OpportuniteFinancementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpportuniteFinancementService {
    private final OpportuniteFinancementRepository opportuniteFinancementRepository;

    @Autowired
    public OpportuniteFinancementService(OpportuniteFinancementRepository opportuniteFinancementRepository) {
        this.opportuniteFinancementRepository = opportuniteFinancementRepository;
    }

    // methods to handle CRUD operations
}