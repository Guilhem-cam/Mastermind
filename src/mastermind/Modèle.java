package mastermind;

import java.awt.Color;
import java.util.ArrayList;

public class Modèle {
	Color[] COULEURS= new Color[7];
	int DIFFICULTE;
	enum Etat {ENCOURS,GAGNEE,PERDU};
	
	
	public Modèle() {
		this.COULEURS[0]=Color.yellow;
		this.COULEURS[1]=Color.green;
		this.COULEURS[2]=Color.blue;
		this.COULEURS[3]=Color.red;
		this.COULEURS[4]=Color.magenta;
		this.COULEURS[5]=Color.orange;
		this.COULEURS[6]=Color.white;
		this.COULEURS[7]=Color.black;
		
		this.DIFFICULTE=0;
		
	}
	
}
