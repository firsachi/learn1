package task6;

import task6.module_6_4.Citizen;

/**
 * Created by firsov on 29.03.2017.
 */
public abstract class CitizenFactory {

    public abstract Citizen citizenEnglishman();
    public abstract Citizen chineseCitizen();
    public abstract Citizen italianCitizen();
    public abstract Citizen createRussian();

    public static CitizenFactory getgetInstance(){
        Class clazz = null;
        try {
            clazz = Class.forName("task6.module_6_4.Cantryfactory");
            return (CitizenFactory) clazz.newInstance();

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
