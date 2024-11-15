package Lazaar;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Personne {
    
    private StringProperty nom;
    private StringProperty prenom;
    private IntegerProperty age;
    
    Personne(String nom, String prenom, int age) {
        this.nom = new SimpleStringProperty(nom);
        this.prenom =  new SimpleStringProperty(prenom);
        this.age = new SimpleIntegerProperty(age);
    }
    StringProperty nomProperty() {
        return nom;
    }
    StringProperty prenomProperty() {
        return prenom;
    }
    IntegerProperty ageProperty() {
        return age;
    }
    void setNom(String nom) {
        this.nom.set(nom);
    }
    void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }
    void setAge(int age) {
        this.age.set(age);
    }
}
