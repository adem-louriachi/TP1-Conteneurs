package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;
import java.util.ArrayList;

public class GestionExpeditions {
    public static void main(String[] args) {
        ArrayList<Conteneur> conteneurs;
        conteneurs = (ArrayList<Conteneur>) Lecteur.charger("Conteneurs.ser");
        for (int i = 0; i < conteneurs.size() - 1; i++) {
            System.out.println(conteneurs.get(i).toString());
        }
    }
}
