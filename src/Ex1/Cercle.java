package Ex1;
public class Cercle extends Forme {

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        // TODO Auto-generated method stub
        return 2*Math.PI*rayon;
    }

    @Override
    public double surface() {
        // TODO Auto-generated method stub
        return Math.PI*rayon*rayon;
    }

    @Override
    public void ContenantCarre(double surf) {
        if (surf >= surface()) {
            System.out.println("Cette Cercle de rayon " + getRayon() + " peut contenir un carré de surface " + surf);
        } else {
            System.out.println("Cette Cercle de rayon " + getRayon() + " ne peut pas contenir un carré de surface " + surf);
        }
    }
}
