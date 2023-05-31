
public class Arbitre {
    /** Constructeur privé */
    private Arbitre()
    {}
     
    
    private static Arbitre INSTANCE = null;
     
    /** Point d'accès pour l'instance unique du singleton */
    public static Arbitre getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new Arbitre(); 
        }
        return INSTANCE;
    }
}


