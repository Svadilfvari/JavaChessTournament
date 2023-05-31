
public class GrandMaitre extends ChessPlayer  {
	  

	

	public GrandMaitre(String name, int elo) throws EloBoundaryException {
		super(name, elo);
		
		if (elo<2500)
			throw new EloBoundaryException ("Pas un Elo d'un grand maitre");
		
		
	}
	
	public void FaireAffronter(ChessPlayer p) {  // méthode qui fait affronter deux joueurs par le biais de la vérification de  l'atribut cas
		if(this.cas==true|| p.cas==true) {
			System.out.println("Ces deux joueurs "+this.Name+" et "+p.Name+ " ne peuvent s'affronter");
		}
		else {
			this.cas=true ;  // Nous changeons la valeur de l'attribut cas  
			p.cas=true;
			this.adversaire=p;
			p.AjouterNombreMatch();
			this.AjouterNombreMatch();
			System.out.println(this.Name+" , vas donc affronter "+p.Name);
		}
	}
	

}
