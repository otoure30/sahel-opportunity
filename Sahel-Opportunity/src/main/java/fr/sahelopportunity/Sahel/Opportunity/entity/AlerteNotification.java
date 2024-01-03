// Alertes et Notifications
fr.sahelopportunity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Alertes_Notifications")
public class AlerteNotification {
    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name="utilisateur_id", nullable=false)
    private Utilisateur utilisateur;
    private String type_alerte;
    private String statut;
    private String preferences_notification;
    // getters and setters
}