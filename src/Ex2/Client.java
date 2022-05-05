package Ex2;

public class Client extends Personne implements Homme {

    private Integer numero;

    public Client(String nom, String prenom, Integer numero) {
        super(nom, prenom);
        this.numero = numero;
    }

    @Override
    public void indentite() {
        System.out.println("Je suis " + getPrenom() + " " + getNom() + ". Mon numero est " + numero);
    }    
}
