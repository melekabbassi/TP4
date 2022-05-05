package Ex1;
public class Rectangle extends Forme {

    private Integer largeur;
    private Integer longueur;

    public Rectangle(Integer largeur, Integer longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    // getters and setters

    public Integer getLargeur() {
        return largeur;
    }

    public void setLargeur(Integer largeur) {
        this.largeur = largeur;
    }

    public Integer getLongueur() {
        return longueur;
    }

    public void setLongueur(Integer longueur) {
        this.longueur = longueur;
    }

    
    @Override
    public double perimetre() {
        // TODO Auto-generated method stub
        return 2*(longueur+largeur);
    }

    @Override
    public double surface() {
        // TODO Auto-generated method stub
        return longueur*largeur;
    }

    @Override
    public void ContenantCarre(double surf)  {
        if (surf >= surface()) {
            System.out.println("Ce Rectangle de largeur " + getLargeur() + " et de longeur " + getLongueur() + " peut contenir un carré de surface " + surf);
        } else {
            System.out.println("Ce Rectangle de largeur " + getLargeur() + " et de longeur " + getLongueur() + " ne peut pas contenir un carré de surface " + surf);
        }
    }
}
