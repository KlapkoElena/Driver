package Driver;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Driver> driverList = new ArrayList<>();
        System.out.println("List of verified persons who never had fines: " + "\n" + listOfPossibleDrivers()
                + "\n General list of people to be checked: \n" + listOfPossibleDrivers2()
                + "\n Allowed to drive: \n" + abilityToDrive(driverList));
    }

    // список водителей никогда не имеющих штрафов
    public static List<Driver> listOfPossibleDrivers() {
        List<Driver> list = new ArrayList<>();
        list.add(new Driver("Dik", 17, true));
        list.add(new Driver("Nik", 28, true));
        list.add(new Driver("Den", 15, false));
        return list;
    }

    // список водителей с полученными ранее штрафами
    public static List<Driver> listOfPossibleDrivers2() {
        List<Driver> list2 = new ArrayList<>();
        list2.add(new Driver("Bob", 30, true, 100));
        list2.add(new Driver("Anna", 25, false, 400));
        list2.add(new Driver("Mike", 20, true, 300));
        list2.add(new Driver("Sem", 40, true, 800));

        // объединение списков доступных на проверку персон
        list2.addAll(4, listOfPossibleDrivers());
        return list2;
    }

    // проверка возможности управления авто (от 18 лет; наличие прав; срок штрафа истек и равен 0)
    public static List<Driver> abilityToDrive(List<Driver> list) {
        for (Driver driver : listOfPossibleDrivers2()) {
            if (driver.haveDriversLicense() && (driver.getAge() > 18) & driver.getDaysWithoutPenalties() > 365) {
                list.add(driver);
            }
        }
        for (Driver driver : listOfPossibleDrivers2()) {
            if (driver.haveDriversLicense() && (driver.getAge() > 18) & driver.getDaysWithoutPenalties() == 0) {
                list.add(driver);
            }
        }
        return list;
    }
}
