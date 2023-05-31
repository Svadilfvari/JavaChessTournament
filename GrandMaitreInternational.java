
public class GrandMaitreInternational extends GrandMaitre{
	
	private final int NbrGame; // cet attribut représente le nbr de match avant le championnat   

	public GrandMaitreInternational(String name, int elo,int NbrGame) throws EloBoundaryException,NumberOfGamesBoundaryException {
		super(name, elo);
		this.NbrGame=NbrGame;
		if (elo<2500)
			throw new EloBoundaryException ("Pas un Elo d'un grand maitre");
		if (NbrGame<9)
			throw new NumberOfGamesBoundaryException("Pas suffisamment de match pour être un Grand Maitre International ");
	}
	
	
	
	public void FaireAffronter(ChessPlayer p) {
		if(this.cas==true|| p.cas==true) {
			System.out.println("Ces deux joueurs "+this.Name+" et "+p.Name+ " ne peuvent s'affronter");
		}
		else {
			this.cas=true ;
			p.cas=true;
			System.out.println(this.Name+" , vas donc affronter "+p.Name);
		}
	}
	
	
	
}
