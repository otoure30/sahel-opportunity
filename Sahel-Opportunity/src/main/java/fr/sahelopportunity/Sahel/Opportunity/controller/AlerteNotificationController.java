// AlerteNotificationController

package fr.sahelopportunity.Sahel.Opportunity.controller;

import fr.sahelopportunity.Sahel.Opportunity.service.AlerteNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "api/v1/alertenotification")
public class AlerteNotificationController {
    private final AlerteNotificationService alerteNotificationService;

    @Autowired
    public AlerteNotificationController(AlerteNotificationService alerteNotificationService) {
        this.alerteNotificationService = alerteNotificationService;
    }

    // endpoints to handle CRUD operations
}