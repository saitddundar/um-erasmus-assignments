package sport;

public class Training extends Event {

    private String trainerName;
    private boolean cancelled;

    public Training(String title, ScheduledDate scheduledDate, String trainerName) {
        super(title, scheduledDate);
        this.trainerName = trainerName;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public String toString() {
        return "Event:" + getTitle() + "," +scheduledDate + "," + cancelled + "," + trainerName;
    }

}
