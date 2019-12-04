package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;

import java.util.ArrayList;
import java.util.Collection;
import java.io.*;
import java.lang.Object;

public class Lecteur {
    public static Collection<Conteneur> charger(String fichier) {

        ArrayList<Conteneur> conteneurs = new ArrayList<>();

        try {
            //Ouvre le fichier
            FileInputStream fis = new FileInputStream(fichier);

            //Lire le fichier
            ObjectInputStream objis = new ObjectInputStream(fis);

            try {
            while (true) {
                Object obj = objis.readObject();
                if (obj.getClass().equals(Conteneur.class)) {
                    conteneurs.add((Conteneur) obj);
                }
            }
        }

        catch (EOFException e) {
            System.out.println("Fin de fichier" + '\n');
        }

        }

        catch (IOException e) {}

        catch (ClassNotFoundException e) {}

        return conteneurs;
    }
}