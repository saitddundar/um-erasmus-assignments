package infrastructure;

public class Hall extends Venue {
    private boolean eveningGames;
    private int baseCapacity;

    public Hall(String name, String phoneNumber, int baseCapacity, boolean eveningGames) {
        super(name, phoneNumber, baseCapacity);
        this.eveningGames = eveningGames;
        this.baseCapacity = baseCapacity;
    }

    public boolean hasEveningGames() {
        return eveningGames;
    }

    public int getBaseCapacity() {
        return baseCapacity;
    }

    @Override
    public double returnCapacity() {
        if (eveningGames) {
            return baseCapacity * 1.2;
        }
        return baseCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +","+ eveningGames;
    }
}
