// OpportuniteFinancementController

package fr.sahelopportunity.Sahel.Opportunity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/opportunitefinancement")
public class OpportuniteFinancementController {
    private final OpportuniteFinancementService opportuniteFinancementService;

    @Autowired
    public OpportuniteFinancementController(OpportuniteFinancementService opportuniteFinancementService) {
        this.opportuniteFinancementService = opportuniteFinancementService;
    }

    // endpoints to handle CRUD operations
}