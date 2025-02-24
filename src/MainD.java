import Dao.IDao;
import Metier.IMetier;
import Metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class MainD {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Main.class.getResourceAsStream("/config.txt");
        Scanner scanner = new Scanner(inputStream);
        String daoClassName = scanner.nextLine(); // Lire le nom de la classe de config file
        scanner.close();
        System.out.println("Hello");
        // instantiation dynamique
        IDao dao = (IDao) Class.forName(daoClassName).newInstance();
        IMetier metier = new MetierImpl(dao);

        System.out.println("Resultat: " + metier.calcul());
    }
}
