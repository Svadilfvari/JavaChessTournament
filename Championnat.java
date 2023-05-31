
public class Championnat  {
	
	ChessPlayer[] championnat;  //cette classe g�re un tableau de joueur d'�checs 
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
 
	public static void DebutChampionnat() {         // message de d�part
		System.out.println("D�but de l'organisation du championnat");
		
		{
			
		}
	}

	
}

