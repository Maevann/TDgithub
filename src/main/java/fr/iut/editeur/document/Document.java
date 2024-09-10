package fr.iut.editeur.document;

import fr.iut.editeur.commande.*;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        remplacer(debut,fin,texte.substring(debut,fin+1).toUpperCase());
    }

    public void effacer(int debut, int fin){
        remplacer(debut,fin,"");
    }

    public void clear(){
        texte="a";
    }

    public void inserer (int pos, String txt) {
        remplacer(0, texte.length() - 1,texte.substring(0, pos + 1) + txt + texte.substring(pos + 1));
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
