package sport;

import java.time.LocalDate;

public class ScheduledDate {
    private LocalDate date;

    public ScheduledDate() {
    }

    public ScheduledDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDayOfMonth() {
        return date.getDayOfMonth();
    }

    @Override
    public String toString() {
        return "ScheduledDate:" + date;
    }
}
