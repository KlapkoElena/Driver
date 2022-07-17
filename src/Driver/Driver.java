package Driver;

public class Driver {

    public String name;
    public int age;
    public boolean haveDriversLicense;
    public int daysWithoutPenalties;

    public Driver(String name, int age, boolean haveDriversLicense) {
        this.name = name;
        this.age = age;
        this.haveDriversLicense = haveDriversLicense;
    }

    public Driver(String name, int age, boolean haveDriversLicense, int daysWithoutPenalties) {
        this.name = name;
        this.age = age;
        this.haveDriversLicense = haveDriversLicense;
        this.daysWithoutPenalties = daysWithoutPenalties;
    }

    public boolean haveDriversLicense() {
        return haveDriversLicense;
    }

    public int getAge() {
        return age;
    }

    public int getDaysWithoutPenalties() {
        return daysWithoutPenalties;
    }

    @Override
    public String toString() {
        return "Driver: " +
                "name - " + name +
                ", age - " + age +
                ", haveDriversLicense - " + haveDriversLicense +
                ", daysWithoutPenalties - " + daysWithoutPenalties +
                '\n';
    }
}
