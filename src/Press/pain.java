package Press;

public class pain extends Perso_1 {
	public pain (String n, int p, int d, int de ) {
		super(n, p, d, de);
	}
	public void attaquer (pain p) {
		this.pv = this.pv - this.degats ;
}
}
