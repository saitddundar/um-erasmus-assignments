import java.time.LocalDate;

public class Athlete {

    private String name;
    private String surname;
    private int athleteNumber;
    private LocalDate birthDate;

    public Athlete() {}

    
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAthleteNumber() {
        return athleteNumber;
    }

    public void setAthleteNumber(int athleteNumber) {
        this.athleteNumber = athleteNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Athlete(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + "," + surname + "," + athleteNumber + "," + birthDate;
    }
}
