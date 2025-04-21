package sport;

import java.time.LocalDate;

import infrastructure.Venue;

public class Athlete implements Competition {
    private String name;
    private String surname;
    private int athleteNumber;
    private LocalDate birthDate;
    private SportsDiscipline sportsDiscipline;
    private Match[] ownMatchList = new Match[5];
    private int matchCount = 0;

    public Athlete(){}

    public Athlete(String name, String surname, int athleteNumber, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.athleteNumber = athleteNumber;
        this.birthDate = birthDate;
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

    public SportsDiscipline getSportsDiscipline() {
        return sportsDiscipline;
    }
    public void setSportsDiscipline(SportsDiscipline sportsDiscipline) {
        this.sportsDiscipline = sportsDiscipline;
    }

    public Match[] getOwnMatchList() {
        return ownMatchList;
    }

    public void setOwnMatchList(Match[] ownMatchList) {
        if (ownMatchList.length <= 5) {
            this.ownMatchList = ownMatchList;
            matchCount = ownMatchList.length;
        } else {
            System.out.println("Maximum 5 matches are allowed.");
        }
    }

    @Override
    public void checkValidity(Venue venue) {
        for (Match match : venue.getMatchList()) {
            if (match != null) {
                for (Athlete athlete : match.getAthletesList()) {
                    if (athlete != null && athlete.getSurname().equals(this.surname)) {
                        if (matchCount < 5) {
                            ownMatchList[matchCount++] = match;
                            break; 
                        } else {
                            System.out.println("Athlete has reached the match limit.");
                        }
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Athlete:" + name + "," + surname + "," + athleteNumber + "," + birthDate + "," + sportsDiscipline;
    }
}
