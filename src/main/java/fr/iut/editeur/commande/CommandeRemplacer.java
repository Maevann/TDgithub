package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;texte");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        String texte = "";
        if(parameters.length > 3) {
            texte = parameters[3];
        }
        this.document.remplacer(debut,fin,texte);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "'remplacer;debut;fin;texte de remplacement' remplace le texte indiqué aux positions début et fin par le texte passé en paramètre";
    }
}
