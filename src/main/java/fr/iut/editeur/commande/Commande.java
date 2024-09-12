package fr.iut.editeur.commande;

/**
 * Interface des différentes commandes
 */
public interface Commande {
    /**
     * fonction pour exécuter les commande
     */
    void executer();


    /**
     *
     * @return la description des commandes
     */
    public String getDescriptionCommande();
}
