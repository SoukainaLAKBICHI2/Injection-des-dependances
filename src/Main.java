import Dao.DaoImpl;
import Dao.IDao;
import Metier.IMetier;
import Metier.MetierImpl;

public class Main {
    public static void main(String[] args) {
        IDao dao = new DaoImpl(); // instanciation statique
        IMetier metier = new MetierImpl(dao); // Injection des dépendances
        System.out.println("Resultat: " + metier.calcul());
    }
}