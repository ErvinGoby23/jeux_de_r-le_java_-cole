package Press;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		Perso_1 p = new Perso_1("morbit", 10, 50, 60);
		Perso_1 p2 = new Perso_1("spider man", 100, 45, 70);
		Perso_1 p3 = new Perso_1("iron man", 300, 100, 100);
		Perso_1 p4 = new Perso_1("marianne", 300, 130, 150);
		Perso_1 p5 = new Perso_1("sophia", 410, 350, 310 );
		System.out.println(p.nom + " " + p.pv + " " + p.degats + " " + p.defence );
		System.out.println(p2.nom + " " + p2.pv + " " + p2.degats + " " + p2.defence );
		System.out.println(p3.nom + " " + p3.pv + " " + p3.degats + " " + p3.defence );
		System.out.println(p4.nom + " " + p4.pv + " " + p4.degats + " " + p4.defence );
		System.out.println(p5.nom + " " + p5.pv + " " + p5.degats + " " + p5.defence );
		
		ArrayList<Integer> objet = new ArrayList<Integer>();
		objet.add(1);
		objet.add(2);
		objet.add(3);
		objet.add(4);
		 
	    objet o = new objet ("mitrallette", 10);
	    objet o2 = new objet ("bouteille", 56);
	    objet o3 = new objet ("Armure", 20);
	    objet o4 = new objet ("gigi", 35);
	    System.out.println(o.nom + " " + o.pointsAttaque);
	    System.out.println(o2.nom + " " + o2.pointsAttaque); 
	    System.out.println(o3.nom + " " + o3.pointsAttaque); 
	    System.out.println(o4.nom + " " + o4.pointsAttaque); 
	        
		salle s = new salle ("Dark", "MOMO", " bissap");
		salle s2 = new salle ("sun", "jojo", " le tchololo");
		salle s3 = new salle ("la salle de la mort", "chemant", " coca cola");
		salle s4 = new salle ("la salle de la vie ", "toto", " chocolat");
		salle s5 = new salle ("la salle du temps", "chinaye", "power red");
		System.out.println(s.nom + " " + s.personnage + " " + s.objet );
		System.out.println(s2.nom + " " + s2.personnage + " " + s2.objet );
		System.out.println(s3.nom + " " + s3.personnage + " " + s3.objet );
		System.out.println(s4.nom + " " + s4.personnage + " " + s4.objet );
		System.out.println(s5.nom + " " + s5.personnage + " " + s5.objet );
		
		
		donjon d = new donjon ("paan");
		System.out.println(d.nom);
		
		
		obito k = new obito("obito", 100, 50 , 80 );
		System.out.println(k.nom + " " + k.pv + " " + k.degats + " " + k.defence );
		
		pain e = new pain("pain", 250, 60 , 90 );
		System.out.println(e.nom + " " + e.pv + " " + e.degats + " " + e.defence );
		
		orochimaru u = new orochimaru("orochimaru", 300, 80, 100);
		System.out.println(u.nom + " " + u.pv + " " + u.degats + " " + u.defence );
		
		madara m = new madara("madara", 350, 100, 120);
		System.out.println(m.nom + " " + m.pv + " " + m.degats + " " + m.defence );
		
		gladiateur g = new gladiateur("gladiateur",400,250,300);
		
		System.out.println("bienvenue dans le terrible donjons paan appuyer sur entrée pour commencer" );
		
				
		 Scanner bob = new Scanner(System.in);
		 String salle = bob.nextLine();
		 
		 
		 while(!salle.contains ("oui")) {
		 System.out.println("veut-tu rentrer dans la salle Dark ? oui ou non");
		 salle = bob.nextLine();
		 
		 if (salle.contains ("oui")) {
			 System.out.println("tu va affronter le " +k.nom +" avec le hero qui s'appelle " + p.nom + " veut tu continuer?");
			  salle = bob.nextLine();
			  
		 }
		 else if (salle.contains ("non")) {
		 }
			 
			 else { 
			 System.out.println("erreur");
		 }
		 
		 
		
		 }
		 
		 
		
	    
		 
			
			
		 do {
			 
			 System.out.println("le combat commence veut tu attaquer ou defendre?");
			 salle = bob.nextLine();
			 
			 if (salle.contains ("attaquer")) {
				 System.out.println("Vous attaquez !");
				 k.attaquer(p.getdegats());
				 System.out.println("il attaquer !");
				 p.attaquer(k.getdegats());
				 
			 }
			 else if (salle.contains ("defendre")) {
				 System.out.println("Vous defendez !");
				 k.bouclier(p.getdefence());
			 }
			 
		 }while (p.estEnVie() && k.estEnVie()); {
		 }
			
		 
		 
		 System.out.println("voulez vous acceder directement au niveau 2");
		 
		 if(salle.contains("oui"));{
			 int gagner =(int) (Math.random() + objet.size() -1) ;
			 if (gagner==1) {
				 System.out.println(o.nom);
			 } else if (gagner==2){
				 System.out.println(o2.nom);
			 }
			   else if (gagner==3) {
				 System.out.println(o3.nom);
			 }
			   else if (gagner==4){
			      System.out.println(o4.nom);
				 }
		 }
				 
		 
		 while(!salle.contains ("oui")) {
			 System.out.println("veut-tu rentrer dans la "+s2.nom +"? oui ou non");
			 salle = bob.nextLine();
			 
			 if (salle.contains ("oui")) {
				 System.out.println("tu va affronter le " +e.nom +" avec le hero qui s'appelle " + p2.nom + " veut tu continuer?");
				  salle = bob.nextLine();
				  
			 }
			 else if (salle.contains ("non")) {
			 }
				 
				 else { 
				 System.out.println("erreur");
			 }
			
				 
			 }
			
			 
			 
			 do {
				

				 
				 System.out.println("le combat commence veut tu attaquer ou defendre?");
				 salle = bob.nextLine();
				 
				 if (salle.contains ("attaquer")) {
					 System.out.println("Vous attaquez !");
					 e.attaquer(p2.getdegats());
					 System.out.println("il attaquer !");
					 p2.attaquer(k.getdegats());
					 
				 }
				 else if (salle.contains ("defendre")) {
					 System.out.println("Vous defendez !");
					 e.bouclier(p2.getdefence());
				 }
				 
			 }while (p2.estEnVie() && e.estEnVie());
			 
			 while(!salle.contains ("oui")) {
				 System.out.println("veut-tu rentrer dans la "+s3.nom +"? oui ou non");
				 salle = bob.nextLine();
				 
				 if (salle.contains ("oui")) {
					 System.out.println("tu va affronter le " +u.nom +" avec le hero qui s'appelle " + p3.nom + " veut tu continuer?");
					  salle = bob.nextLine();
					  
				 }
				 else if (salle.contains ("non")) {
				 }
					 
					 else { 
					 System.out.println("erreur");
				 }
				 
				 
				
				 }
				 
				 do {
					 
					 System.out.println("le combat commence veut tu attaquer ou defendre?");
					 salle = bob.nextLine();
					 
					 if (salle.contains ("attaquer")) {
						 System.out.println("Vous attaquez !");
						 u.attaquer(p3.getdegats());
						 System.out.println("il attaquer !");
						 p3.attaquer(k.getdegats());
						 
					 }
					 else if (salle.contains ("defendre")) {
						 System.out.println("Vous defendez !");
						 u.bouclier(p3.getdefence());
					 }
					 
				 }while (p3.estEnVie() && u.estEnVie());
				 
				 System.out.println("voulez vous accerder directement au niveau 4");
				 
				 while(!salle.contains ("oui")) {
					 System.out.println("veut-tu rentrer dans la "+s4.nom +"? oui ou non");
					 salle = bob.nextLine();
					 
					 if (salle.contains ("oui")) {
						 System.out.println("tu va affronter le " +m.nom +" avec le hero qui s'appelle " + p3.nom + " veut tu continuer?");
						  salle = bob.nextLine();
						  
					 }
					 else if (salle.contains ("non")) {
					 }
						 
						 else { 
						 System.out.println("erreur");
					 }
					 
					 
					
					 }
					 
					 do {
						 
						 System.out.println("le combat commence veut tu attaquer ou defendre?");
						 salle = bob.nextLine();
						 
						 if (salle.contains ("attaquer")) {
							 System.out.println("Vous attaquez !");
							 m.attaquer(p4.getdegats());
							 System.out.println("il attaquer !");
							 p4.attaquer(k.getdegats());
							 
						 }
						 else if (salle.contains ("defendre")) {
							 System.out.println("Vous defendez !");
							 m.bouclier(p4.getdefence());
						 }
						 
					 }while (p4.estEnVie() && m.estEnVie());
					 
					 System.out.println("voulez vous acceder directement au niveau 5");
					 
					 while(!salle.contains ("oui")) {
						 System.out.println("veut-tu rentrer dans la "+s5.nom +"? oui ou non");
						 salle = bob.nextLine();
						 
						 if (salle.contains ("oui")) {
							 System.out.println("tu va affronter le " +g.nom +" avec le hero qui s'appelle " + p5.nom + " veut tu continuer?");
							  salle = bob.nextLine();
							  
						 }
						 else if (salle.contains ("non")) {
						 }
							 
							 else { 
							 System.out.println("erreur");
						 }
						 
						 
						
						 }
						 
						 do {
							 
							 System.out.println("le combat commence veut tu attaquer ou defendre?");
							 salle = bob.nextLine();
							 
							 if (salle.contains ("attaquer")) {
								 System.out.println("Vous attaquez !");
								 m.attaquer(p4.getdegats());
								 System.out.println("il attaquer !");
								 p5.attaquer(k.getdegats());
								 
							 }
							 else if (salle.contains ("defendre")) {
								 System.out.println("Vous defendez !");
								 g.bouclier(p5.getdefence());
							 }
							 
						 }while (p5.estEnVie() && g.estEnVie());
				 
		 		 					
}
}
