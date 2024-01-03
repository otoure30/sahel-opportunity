// OffreEmploiController
package fr.sahelopportunity.Sahel.Opportunity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/offreemploi")
public class OffreEmploiController {
    private final OffreEmploiService offreEmploiService;

    @Autowired
    public OffreEmploiController(OffreEmploiService offreEmploiService) {
        this.offreEmploiService = offreEmploiService;
    }

    // endpoints to handle CRUD operations
}