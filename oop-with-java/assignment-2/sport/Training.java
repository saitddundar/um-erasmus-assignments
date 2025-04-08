package sport;

public class Training {
    private String trainingDate;


    public Training() {
    }

    public Training(String trainingDate) {
        this.trainingDate = trainingDate;
    }

    public String getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(String trainingDate) {
        this.trainingDate = trainingDate;
    }

    @Override
    public String toString() {
        return "Training:" + trainingDate;
    }
}
