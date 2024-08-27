package Press;

public class orochimaru extends Perso_1{
	public orochimaru (String n, int p, int d, int de ) {
		super (n, p, d, de);
	}
	public void attaquer (orochimaru p) {
		this.pv = this.pv - this.degats ;
}
}