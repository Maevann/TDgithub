package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Classe de la commande inserer, sert à insérer un texte au milieu du document
 */
public class CommandeInserer extends CommandeDocument {

    /**
     *
     * @param document le document sur lequel la commande va être exécuté
     * @param parameters les paramètres de la commande
     */
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

    /**
     *
     * @return description de la commande @link Commande#getDescriptionCommande
     */
    @Override
    public String getDescriptionCommande() {
        return "'inserer;pos;texte a inserer' insère le texte passé en paramètre à partir de la position donnée";
    }
}
