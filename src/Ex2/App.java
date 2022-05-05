package Ex2;

public class App {
    public static void main(String[] args) throws Exception {
        Peuple P = new Peuple();

        Personne p1 = new Personne("Dupont", "Jean");
        Personne p2 = new Personne("Dupont", "Paul");
        Personne p3 = new Personne("Dupont", "Jacques");
        Personne p4 = new Personne("Dupont", "Pierre");
        Personne p5 = new Personne("Dupont", "Jacqueline");

        Client c1 = new Client("Dupont", "Jean", 1);
        Client c2 = new Client("Dupont", "Paul", 2);
        Client c3 = new Client("Dupont", "Jacques", 3);
        Client c4 = new Client("Dupont", "Pierre", 4);

        P.naissance(p1);
        P.naissance(p2);
        P.naissance(p3);
        P.naissance(p4);
        P.naissance(p5);
        P.naissance(c1);
        P.naissance(c2);
        P.naissance(c3);
        P.naissance(c4);

        P.explorer();
    }
}
