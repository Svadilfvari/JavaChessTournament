
public abstract class ChessPlayer  implements NombreDeMatchJouer{
	
	protected int ELO;  // le fameux classement ELO 
	protected int nbrMatch; //nombre de match jou�s par un joueur  
	protected String Name;      //le nom du joueur
	protected boolean cas;  //le cas repr�sente le fait que le joueur ait un adversaire ou non
	protected ChessPlayer adversaire;
	
	
	public ChessPlayer(String name, int elo) throws EloBoundaryException {
		if (elo<=0)
			throw new EloBoundaryException ("Constructeur : Elo inexistant "); //Un ELO ne peut �tre inf�rieur ou �gal � zero
		this.ELO=elo;
		this.Name=name;		
	}
	public ChessPlayer() { //constructeur d'un joueur lambda
		this.ELO=1500;
		this.Name="joueur lambda";
	}
	
	@Override
	public void AjouterNombreMatch() {
		this.nbrMatch++;
	}
	
	public abstract void FaireAffronter(ChessPlayer p);
	

}
