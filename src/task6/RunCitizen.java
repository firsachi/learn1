package task6;

/**
 * Created by firsov on 16.03.2017.
 */
public class RunCitizen {

    public static void main(String[] args) {
        CitizenFactory citizenFactory = CitizenFactory.getgetInstance();
        System.out.println(citizenFactory.citizenEnglishman().sayHello());
        System.out.println(citizenFactory.chineseCitizen().sayHello());
        System.out.println(citizenFactory.italianCitizen().sayHello());
        System.out.println(citizenFactory.createRussian().sayHello());
    }
}
