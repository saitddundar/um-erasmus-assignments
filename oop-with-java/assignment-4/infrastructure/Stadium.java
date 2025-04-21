package infrastructure;

public class Stadium extends Venue {
    private int stadiumCapacity;

    public Stadium(String name, String phoneNumber, int stadiumCapacity) {
        super(name, phoneNumber, stadiumCapacity);
        this.stadiumCapacity = stadiumCapacity;
    }

    public int getStadiumCapacity() {
        return stadiumCapacity;
    }

    @Override
    public double returnCapacity() {
        return stadiumCapacity;
    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
