package sport;

public class ScheduledDate {
    private String date;

    public ScheduledDate() {
    }

    public ScheduledDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ScheduledDate:" + date;
    }

}


