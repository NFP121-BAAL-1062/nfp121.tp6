package question2;

import question1.*;
import java.util.Set;
import java.util.TreeSet;

public class SansDoublon implements Visiteur<Boolean>{
    
  public Boolean visite(Contributeur c){
    return c.solde()>=0; // a compléter;
  }
  
  public Boolean visite(GroupeDeContributeurs g){
    boolean res = false;// a compléter
    // a compléter
    if (g.nombreDeCotisants () > 0 )
     {  
         
         List < Contributeur > diffCon = withoutDoublon (g);
         
        for ( Contributeur c : diffCon)
        { 
            if (c . accepter ( this ))
            {res =  true ;}
        } 
        
     }
    return res ;
  }
  
  
   public  List < Contributeur >  withoutDoublon ( Contributeur  g )
  {
       List < Contributeur > diffCon =  new  ArrayList< Contributeur > ();
         
             
       if (g instanceof  Contributeur )
       {
           Contributeur con = ( Contributeur ) g;
           
                for ( Contributeur c : diffCon)
                {
                    if (c .nom () . equals (con .nom ())) break ;
                    else  
                         {diffCon . add (con);}
                }
          
       }
       else  if (g instanceof  GroupeDeContributeurs )
       {
           GroupeDeContributeurs gc = ( GroupeDeContributeurs ) g;
           Iterator < Contributeur > it = gc . iterator ();
           while (it . hasNext ())
           {
             
               Contributeur t = it . next ();
              
              if (diffCon . contains (t)) break ;
                for ( Contributeur c : diffCon)
                {
                    if (c .nom () . equals (gc .nom ())) break ;
                    else  
                         {sansDoublon (gc);}
                }
           }
       }
    
        return diffCon;
    }
  
  
}