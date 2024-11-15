package Lazaar.Vue;

import javafx.scene.control.*;
import javafx.scene.layout.*;
import Lazaar.Personne;

public class VuePersonne {
    
    private VBox root; // Le conteneur principal
    private Label labelNom;
    private Label labelPrenom;
    private Label labelAge;

    // Constructeur pour afficher les informations de la personne
    public VuePersonne(Personne personne) {
        root = new VBox(10); // Espacement de 10px entre les éléments

        // Création des labels pour chaque propriété de Personne
        labelNom = new Label("Nom: " + personne.nomProperty().get());
        labelPrenom = new Label("Prénom: " + personne.prenomProperty().get());
        labelAge = new Label("Âge: " + personne.ageProperty().get());

        // Ajouter les labels au VBox
        root.getChildren().addAll(labelNom, labelPrenom, labelAge);
    }

    // Getter pour la racine (VBox) afin de l'ajouter à une scène
    public VBox getRoot() {
        return root;
    }
}
