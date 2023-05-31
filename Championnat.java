
public class Championnat  {
	
	ChessPlayer[] championnat;  //cette classe gére un tableau de joueur d'échecs 
	public int NbreJoueur; // nbre de joueur du actuel tournoi
	public static int ToutNbreJoueur; //nbre de joueur de tout les championnats 
	
	
	public Championnat(int NbrJoueur) {
		championnat = new ChessPlayer[NbrJoueur];
	}
	
	public void ajouter(ChessPlayer P) throws ChampionnatPleinException,EloBoundaryException {
		if (P.ELO <1000)
			throw new EloBoundaryException("Ce joueur n'a pas sa place dans ce championnat");
		if (NbreJoueur <championnat.length) {
			championnat[NbreJoueur]=P;
			NbreJoueur++;
			ToutNbreJoueur++;
		}
		else {
			throw new ChampionnatPleinException("Le championnat ne peut plus accepter plus de joueur");
		}
		
		

}
 
	public static void DebutChampionnat() {         // message de départ
		System.out.println("Début de l'organisation du championnat");
		
		{
			
		}
	}

	
}

