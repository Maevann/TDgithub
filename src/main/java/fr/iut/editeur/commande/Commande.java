package fr.iut.editeur.commande;
public interface Commande {
    void executer();



    public default String getDescriptionCommande(cmd){

    }
}
