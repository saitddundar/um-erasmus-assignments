package infrastructure;

import sport.Match;
import sport.SportsDiscipline;
import sport.AddingMatchException;

import java.util.ArrayList;

public abstract class Venue {
    private String name;
    private String phoneNumber;
    private ArrayList<Match> matchList;
    protected SportsDiscipline discipline;

    public Venue(String name, String phoneNumber, int matchCapacity) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.matchList = new ArrayList<>(matchCapacity);
    }

    public void addMatch(Match match) throws AddingMatchException {
        if (match.getScheduledDate().getDayOfMonth() >= 20) {
            throw new AddingMatchException(); 
        }
        matchList.add(match); 
    }

    public void removeMatches() {
        matchList.clear(); 
    }

    public double returnOccupancy() {
        double capacity = returnCapacity();
        if (capacity == 0) return 0;
        return ((double) matchList.size() / capacity) * 100; 
    }

    public abstract double returnCapacity(); 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Match> getMatchList() {
        return matchList;
    }

    public void setMatchList(ArrayList<Match> matchList) {
        this.matchList = matchList;
    }

    public SportsDiscipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(SportsDiscipline discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "Venue:" + name + "," + phoneNumber + "," + discipline;
    }
}
