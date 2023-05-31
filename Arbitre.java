
public class Arbitre {
    /** Constructeur priv� */
    private Arbitre()
    {}
     
    
    private static Arbitre INSTANCE = null;
     
    /** Point d'acc�s pour l'instance unique du singleton */
    public static Arbitre getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new Arbitre(); 
        }
        return INSTANCE;
    }
}


