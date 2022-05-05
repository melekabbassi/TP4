package Ex2;

public class Peuple {
        
    private Homme[] pays;
    private int nbHommes;
        
    public Peuple() {
        this.pays = new Homme[100];
        this.nbHommes = 0;
    }
             
    public void naissance(Homme h) {
            if(!this.estPresent(h)) {
            this.pays[this.nbHommes] = h;
            this.nbHommes++;
        }
    }
            
    public void mort(Homme h) {
        if(this.estPresent(h)) {
            for(int i = 0; i < this.nbHommes; i++) {
                if(this.pays[i] == h) {
                    this.pays[i] = this.pays[this.nbHommes-1];
                    this.nbHommes--;
                }
            }
        }
    }
             
    public boolean estPresent(Homme h) {
        for(int i = 0; i < this.nbHommes; i++) {
            if(this.pays[i] == h) {
                return true;
            }
        }
        return false;
    }

    void explorer(){
        for(int i = 0; i < this.nbHommes; i++) {
            this.pays[i].indentite();
        }
    }
}
