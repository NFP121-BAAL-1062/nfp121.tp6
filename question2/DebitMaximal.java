package question2;

import question1.Contributeur;
import question1.GroupeDeContributeurs;
import question1.Visiteur;
import question1.Cotisant;

public class DebitMaximal implements Visiteur<Integer>{

  public Integer visite(Contributeur c){
    return c.solde(); // a compléter
  }
  
  public Integer visite(GroupeDeContributeurs g){
    int res = 0;
    // a compléter
    if (g.getChildren ().size() ==  0 ) {
            return  0 ;
        }
        
        for ( int i =  1 ; i < g . getChildren () . size (); ++ i) {
            int temp = (( Contributeur ) g.getChildren().get(i)).solde();
            if (temp >= res) continue ;
            res = temp;
        }
    return res ;
  }
}