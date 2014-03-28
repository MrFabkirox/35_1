/**
 * Une classe utilitaire avec diverses méthodes concernant les tableaux.
 * @author rosmord
 *
 */
public class Devoir1 {
        
        /**
         * Prend en argument un tableau, et renvoie la seconde plus grande valeur dans ce tableau.
         * <p>Formellement, si max(tab) est la plus grande valeur dans le tableau, renvoie une valeur 
         * du tableau inférieure à max(tab), mais supérieure à toutes les autres.
         * <p> Dans tous les cas où il n'y a pas de seconde valeur définie dans le tableau, on 
         * <em>doit</em> renvoyer une RuntimeException.
         * <p> Quelques exemples :
         * <ul>
         * <li> pour {8,2,5,7}, renverra 7
         * <li> pour {8,8, 2, 6, 7,7, 2,2,2} renverra 7
         * </ul>
         * @param tab
         * @return la seconde plus grande valeur du tableau.
         * @throws RuntimeException en cas de problème de définition.
         */
        public static int secondeValeur(int tab[]) {

        		 if (tab == null || tab.length < 2 ){
        			 throw new RuntimeException("tableau non initialisé ou de taille insuffisante");
        		 }
        		 else {

        			 int max = 0;
        			 int res = 0;

        			 for (int i : tab){

        				 	if (i > max){
        				 		res = max;
        				 		max = i;
        				 	}
        				 	else {
        				 		if (i > res && i !=max){
        				 			res = i;
        				 		}
        				 	}
        			 }

        			 if (res == 0){
        				 throw new RuntimeException("le tableau contient moins de deux valeurs distinctes");
        			 }
        			 else return res;

        		 }
        }
}