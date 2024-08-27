package Press;
public class Perso_1 {

	String nom ; 	
	int pv ;
	int degats ;
	int defence ;
	int pointsAttaque;
	

public Perso_1 (String n, int p, int d, int de) {
  this.nom = n;
  this.pv = p;
  this.degats = d;
  this.defence = de ;
}

public void attaquer (int degats) {
    this.pv = this.pv - degats;
    System.out.println(this.nom + " reçoit " + degats + " dégats !");
    if (this.pv <= 0) {
        this.pv = 0;
        System.out.println(this.nom + " est mort !");
    }
}

public void bouclier (int defence) {
    this.defence -= degats;
    System.out.println(this.nom + " reçoit " + defence + " denfence !");
    if (this.defence <= 0) {
        this.defence = 0;
        System.out.println(this.nom + " plus de defence !");
    }
}

    public boolean estEnVie() {
        return this.pv > 0;
    }
    public boolean pasdeVie() {
        return this.defence > 0;
    }
    public int getdegats() {
        return this.degats;
    }
    public int getdefence() {
        return this.defence;
    }
    public int getpointsVie() {
        return pv;
    }
    }
  


