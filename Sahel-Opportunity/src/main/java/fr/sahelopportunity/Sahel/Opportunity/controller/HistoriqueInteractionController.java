// HistoriqueInteractionController
package fr.sahelopportunity.Sahel.Opportunity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "api/v1/historiqueinteraction")
public class HistoriqueInteractionController {
    private final HistoriqueInteractionService historiqueInteractionService;

    @Autowired
    public HistoriqueInteractionController(HistoriqueInteractionService historiqueInteractionService) {
        this.historiqueInteractionService = historiqueInteractionService;
    }

    // endpoints to handle CRUD operations
}