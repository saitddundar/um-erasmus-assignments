package sport;

public class Match extends Event {

    private boolean isFinished;
    private Athlete[] athletesList = new Athlete[10];
    private int athleteCount=0;

    public Match(String title, ScheduledDate scheduledDate) {
        super(title, scheduledDate);
    }

    public void addAthleteToMatch(Athlete athlete) {
        if (athleteCount < athletesList.length) {
            athletesList[athleteCount++] = athlete;
        }
    }

    public void removeAthleteFromMatch(Athlete athlete) {
        for (int i = 0; i < athleteCount; i++) {
            if (athletesList[i].equals(athlete)) {
                athletesList[athleteCount] = null;
                break;
            }
        }
    }

    public boolean removeAthleteFromMatch(int athleteNumber) {
        for (int i = 0; i < athleteCount; i++) {
            if (athletesList[i].getAthleteNumber() == athleteNumber) {
                athletesList[athleteCount] = null;
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
            if (athletesList[i].getSurname().equals(surname)) {
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
        return "Event:" + getTitle() + "," +getScheduledDate() + "," + isFinished;
    }


}
