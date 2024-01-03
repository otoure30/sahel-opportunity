// AlerteNotificationService
package fr.sahelopportunity.Sahel.Opportunity.service;

import fr.sahelopportunity.Sahel.Opportunity.repository.AlerteNotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlerteNotificationService {
    private final AlerteNotificationRepository alerteNotificationRepository;

    @Autowired
    public AlerteNotificationService(AlerteNotificationRepository alerteNotificationRepository) {
        this.alerteNotificationRepository = alerteNotificationRepository;
    }

    // methods to handle CRUD operations
}