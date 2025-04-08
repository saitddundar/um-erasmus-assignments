package sport;

public class Athlete {
    private String name;
    private String surname;
    private int athleteNumber;
    private String birthDate;

    public Athlete() {}

    public Athlete(String name, String surname, int athleteNumber, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.athleteNumber = athleteNumber;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAthleteNumber() {
        return athleteNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAthleteNumber(int athleteNumber) {
        this.athleteNumber = athleteNumber;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Athlete:" + name + "," + surname + "," + athleteNumber + "," + birthDate;
    }
}
