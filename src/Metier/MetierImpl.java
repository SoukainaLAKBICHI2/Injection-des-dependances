package Metier;

import Dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // le couplage faible


    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getData() * 2;
    }
}

