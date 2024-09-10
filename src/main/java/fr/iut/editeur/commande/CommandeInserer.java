package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument {

    public CommandeInserer(Document document, String[] parameters) {super(document, parameters);}

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;pos;texte");
            return;
        }
        int pos = Integer.parseInt(parameters[1]);
        String texte = parameters[2];
        this.document.inserer(pos, texte);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "'inserer;pos;texte a inserer' insère le texte passé en paramètre à partir de la position donnée";
    }
}
