package task6.module_6_4;

import task6.CitizenFactory;

/**
 * Created by firsov on 29.03.2017.
 */
public class Cantryfactory  extends CitizenFactory{

    @Override
    public Citizen citizenEnglishman() {
        return new CitizenEnglishman();
    }

    @Override
    public Citizen chineseCitizen() {
        return new ChineseCitizen();
    }

    @Override
    public Citizen italianCitizen() {
        return new ItalianCitizen();
    }

    @Override
    public Citizen createRussian() {
        return new RussianCitizen();
    }
}
