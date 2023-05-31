
public class JoueurNormal extends ChessPlayer {

	public JoueurNormal(String name, int elo) throws EloBoundaryException {
		super(name, elo);
		
		if (elo>2500||elo<1000)
			throw new EloBoundaryException ("Ce joueur doit être normal ! ");
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
	
	


