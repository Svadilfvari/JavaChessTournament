
public class TestChampionnat {

	public static void main(String[] args) {
		Championnat.DebutChampionnat();
		
		Championnat Ch=new Championnat (5);
		
		try {
			ChessPlayer p= new GrandMaitre("Nakamura",2736);
			ChessPlayer p2= new GrandMaitre("Carlsen",2862);
			ChessPlayer p3= new GrandMaitre("Kasparov",2851);
			ChessPlayer p4= new GrandMaitre("jean",2500);
			ChessPlayer p5= new JoueurNormal("kevin",1500);
			
			p4.FaireAffronter(p5);
			Ch.ajouter(p3);
			Ch.ajouter(p2);
			Ch.ajouter(p);
			
			p.FaireAffronter(p2);
			
			
			System.out.println(" "+Championnat.ToutNbreJoueur);
			
		} catch (EloBoundaryException e) {
			System.out.println(" "+e.toString());
			
		} catch (ChampionnatPleinException e) {
			System.out.println(" "+e.toString());
		}
		
		
	}

}
