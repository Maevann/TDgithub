package fr.iut.editeur.document;

import fr.iut.editeur.commande.*;

public class Document {

    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }
	
    public String getTexteDocument() {
        return texteDocument;
    }

    public void setTexteDocument(String texteDocument) {
        this.texteDocument = texteDocument;
    }

    public void ajouter(String texteDocument) {
        this.texteDocument += texteDocument;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(fin + 1);
        texteDocument = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        remplacer(debut,fin,texteDocument.substring(debut,fin+1).toUpperCase());
    }

    public void effacer(int debut, int fin){
        remplacer(debut,fin,"");
    }

    public void clear(){
        texteDocument="a";
    }

    public void inserer (int pos, String txt) {
        remplacer(0, texteDocument.length() - 1,texteDocument.substring(0, pos + 1) + txt + texteDocument.substring(pos + 1));
    }

    @Override
    public String toString() {
        return this.texteDocument;
    }
}
