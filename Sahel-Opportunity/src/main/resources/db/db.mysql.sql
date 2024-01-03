-- Base de Données Utilisateurs
CREATE TABLE Utilisateurs (
    id INT PRIMARY KEY,
    nom VARCHAR(100),
    email VARCHAR(100),
    mot_de_passe VARCHAR(100),
    experience_professionnelle TEXT,
    education TEXT,
    competences TEXT,
    preferences TEXT,
    historique_recherche TEXT
);

-- Base de Données Offres d'Emploi
CREATE TABLE Offres_Emploi (
    id INT PRIMARY KEY,
    titre VARCHAR(100),
    description TEXT,
    exigences TEXT,
    employeur VARCHAR(100),
    lieu VARCHAR(100),
    type_contrat VARCHAR(50)
);

-- Base de Données Opportunités de Financement
CREATE TABLE Opportunites_Financement (
    id INT PRIMARY KEY,
    nom VARCHAR(100),
    type VARCHAR(50),
    montant DECIMAL(10, 2),
    criteres_eligibilite TEXT,
    bailleurs_fonds TEXT
);

-- Base de Données Historique des Interactions
CREATE TABLE Historique_Interactions (
    id INT PRIMARY KEY,
    utilisateur_id INT,
    historique_recherche TEXT,
    offres_consultees TEXT,
    actions TEXT,
    FOREIGN KEY (utilisateur_id) REFERENCES Utilisateurs(id)
);

-- Base de Données Alertes et Notifications
CREATE TABLE Alertes_Notifications (
    id INT PRIMARY KEY,
    utilisateur_id INT,
    type_alerte VARCHAR(50),
    statut VARCHAR(50),
    preferences_notification TEXT,
    FOREIGN KEY (utilisateur_id) REFERENCES Utilisateurs(id)
);

-- Base de Données Evenements
CREATE TABLE Evenements (
    id INT PRIMARY KEY,
    nom VARCHAR(100),
    date DATE,
    lieu VARCHAR(100),
    description TEXT
);

