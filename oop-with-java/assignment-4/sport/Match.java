package sport;

import infrastructure.Venue;

import java.time.LocalDate;

public class Match extends Event implements Competition {

    private boolean isFinished;
    private Athlete[] athletesList = new Athlete[10];
    private int athleteCount = 0;

    public Match(String title, ScheduledDate scheduledDate) {
        super(title, scheduledDate);
    }

    public void addAthleteToMatch(Athlete athlete) throws AddingAthleteException {
        if (!isEligibleToCompete(athlete)) {
            throw new AddingAthleteException("AddingAthleteException");
        }

        // Add the athlete if there is space
        if (athleteCount < athletesList.length) {
            athletesList[athleteCount++] = athlete;
        }
    }

    public boolean isEligibleToCompete(Athlete athlete){
        int birthYear = athlete.getBirthDate().getYear();
        int thisYear = LocalDate.now().getYear();
        int age = thisYear - birthYear;

        return age >= 14 && age <= 18;
    }

    public void removeAthleteFromMatch(Athlete athlete) {
        for (int i = 0; i < athleteCount; i++) {
            if (athletesList[i].equals(athlete)) {
                athletesList[i] = null;
                break;
            }
        }
    }

    public boolean removeAthleteFromMatch(int athleteNumber) {
        for (int i = 0; i < athleteCount; i++) {
            if (athletesList[i].getAthleteNumber() == athleteNumber) {
                athletesList[i] = null;
                return true;
            }
        }
        return false;
    }

    public int getNumberOfAthletesInMatch() {
        return athleteCount;
    }

    public boolean athleteExists(String surname) {
        for (int i = 0; i < athleteCount; i++) {
            if (athletesList[i] != null && athletesList[i].getSurname().equals(surname)) {
                return true;
            }
        }
        return false;
    }

    public ScheduledDate getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(ScheduledDate scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public Athlete[] getAthletesList() {
        return athletesList;
    }

    public void setAthletesList(Athlete[] athletesList) {
        this.athletesList = athletesList;
    }

    public int getAthleteCount() {
        return athleteCount;
    }

    public void setAthleteCount(int athleteCount) {
        this.athleteCount = athleteCount;
    }

    @Override
    public String toString() {
        return "Event:" + getTitle() + "," + getScheduledDate() + "," + isFinished;
    }

    @Override
    public void checkValidity(Venue venue) {
        for (Match m : venue.getMatchList()) {
            if (m != null && m.equals(this)) {
                System.out.println("Match " + getTitle() + " can be performed");
                return;
            }
        }
        System.out.println("Match " + getTitle() + " has not been added to venue");
    }
}
