package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMinuscule extends CommandeDocument {

    public CommandeMinuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : minuscule;num1;num2");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.remplacer(debut,fin,document.getTexteDocument().substring(debut,fin + 1).toLowerCase());
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "'minuscule;debut;fin' met en minuscule le texte indiqué aux positions début et fin";
    }
}
