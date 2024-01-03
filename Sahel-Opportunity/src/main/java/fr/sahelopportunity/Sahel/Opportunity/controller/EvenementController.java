// EvenementController
package fr.sahelopportunity.Sahel.Opportunity.controller;

import fr.sahelopportunity.Sahel.Opportunity.service.EvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "api/v1/evenement")
public class EvenementController {
    private final EvenementService evenementService;

    @Autowired
    public EvenementController(EvenementService evenementService) {
        this.evenementService = evenementService;
    }

    // endpoints to handle CRUD operations
}